package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Deck;
import model.Card;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DeckController extends Controller<Deck> {
    @FXML private ListView<Card> cardsLv;
    @FXML private Button showCardBtn;
    @FXML private Button closeBtn;

    @FXML
    private void initialize(){
        cardsLv.setItems(model.getCards());
    }

    @FXML
    private void handleShowCard(ActionEvent event){
        Card card = getSelectedCard();

        if (card != null){
            ViewLoader.showStage(card, "/view/CardView.fxml", card.getName(), new Stage());
        }
    }

    private Card getSelectedCard(){
        return cardsLv.getSelectionModel().getSelectedItem();
    }

    @FXML 
    private void handleClose(ActionEvent event){
        stage.close();
    }
}
