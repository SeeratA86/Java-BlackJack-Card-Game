package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import model.Dealer;
import model.Player;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.stage.Stage;
import model.exception.EmptyDeckException;
import model.exception.RoundNotReadyException;
import javafx.scene.input.MouseEvent;
import javafx.application.Platform;


public class DealerController extends Controller<Dealer> {
    @FXML private Text player1ScoreTxt;
    @FXML private Text player2ScoreTxt;
    @FXML private Text player3ScoreTxt;
    @FXML private Text player4ScoreTxt;

    @FXML private Button callButton;
    @FXML private Button dealButton;
    @FXML private Button playroundButton;
    @FXML private Button exitButton;
   

    private Dealer getDealer() {
        return model;
    }

    @FXML
    private void initialize() {
        player1ScoreTxt.textProperty().bind(
        getDealer().getPlayers().get(0).totalHealthProperty().asString()
        );

        player2ScoreTxt.textProperty().bind(
            getDealer().getPlayers().get(1).totalHealthProperty().asString()
        );

        if (getDealer().getPlayers().size() > 2) {
            player3ScoreTxt.textProperty().bind(
                getDealer().getPlayers().get(2).totalHealthProperty().asString()
            );
        }

        if (getDealer().getPlayers().size() > 3){
            player4ScoreTxt.textProperty().bind(
                getDealer().getPlayers().get(3).totalHealthProperty().asString()
            );
        }

        for (Player player : getDealer().getPlayers()){
            ViewLoader.showStage(
                player,
                "/view/PlayerView.fxml",
                player.getName(),
                new Stage()
            );
        }
    }

    @FXML
    private void handleCall(ActionEvent event) {
        Player winner = getWinner();
        ViewLoader.showStage(winner, "/view/PlayerWinView.fxml", "Game Over", new Stage());
    }

    @FXML
    private void handleDeal(ActionEvent event){
        try {
            getDealer().deal();
        } catch (EmptyDeckException e) {
            ViewLoader.showStage(e, "/view/ErrorView.fxml", "Error", new Stage());
        }
    }

    private Player getWinner(){
        Player winner = getDealer().getPlayers().get(0);

        for(Player player : getDealer().getPlayers()){
            if (player.totalHealthProperty().get() > winner.totalHealthProperty().get()){
                winner = player;
            }
        }
        return winner;
    }

    @FXML 
    private void handlePlayRound(ActionEvent event) {
        try {
            getDealer().play();
        } catch(RoundNotReadyException e) {
            ViewLoader.showStage(e, "/view/ErrorView.fxml","Error", new Stage());
        }
    }

    @FXML
    private void handleMainDeck(MouseEvent event){
        ViewLoader.showStage(getDealer().getMainDeck(), "/view/DeckView.fxml", "Main Deck", new Stage());
    }

    @FXML
    private void handleSecondaryDeck(MouseEvent event){
        ViewLoader.showStage(getDealer().getSecondaryDeck(), "/view/DeckView.fxml", "Secondary Deck", new Stage());
    }

    @FXML
    private void handleExit(ActionEvent event) {
        Platform.exit();
    } 
}
