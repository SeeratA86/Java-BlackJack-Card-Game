package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import model.Player;
import model.Card;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.stage.Stage;
import model.exception.FullHandException;

public class PlayerController extends Controller<Player> {
    @FXML private TableView<Card> handTv;
    @FXML private ListView<Card> tempHandLv;
    @FXML private ImageView cardIv;
    @FXML private Button selectBtn;
    @FXML private Button placeBtn;

    @FXML
    private void handleSelect(ActionEvent event) {
        Card card = getSelectedHandCard();

        if(card != null){
            model.select(card);
        }
    }

    @FXML
    private void handlePlace(ActionEvent event) {
        Card card = getSelectedTempCard();

        if(card != null){
            try{
                model.place(card);
            } catch (FullHandException e){
                ViewLoader.showStage(e, "/view/ErrorView.fxml", "Error", new Stage());
            }
        }
    }

    private Card getSelectedTempCard() {
        return tempHandLv.getSelectionModel().getSelectedItem();
    }

    private Card getSelectedHandCard() {
        return handTv.getSelectionModel().getSelectedItem();
    }

    @FXML
    private void initialize() {
        handTv.setItems(model.getHand());
        tempHandLv.setItems(model.getTempHand());

        selectBtn.setDisable(true);
        placeBtn.setDisable(true);

        handTv.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldCard, newCard) -> {
                showCardImage((newCard));
                selectBtn.setDisable(newCard == null);
            }
        );

        tempHandLv.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldCard, newCard) -> {
                showCardImage(newCard);
                placeBtn.setDisable(newCard == null);
            }
        );
    }

    private void showCardImage(Card card){
        if (card == null) {
            cardIv.setImage(null);
        } else{
            String fileName = card.getName().toLowerCase().replace(" ", "") + ".png";
            Image image = new Image(getClass().getResource("/view/image/cards/" + fileName).toExternalForm());
            cardIv.setImage(image);
        }
    }
}
