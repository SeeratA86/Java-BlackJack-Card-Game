package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import model.Card;

public class CardController extends Controller<Card> {
    @FXML private ImageView cardIv;

    @FXML
    private void initialize(){
        String fileName = model.getName().toLowerCase().replace(" ", "") + ".png";
        Image image = new Image(getClass().getResource("/view/image/cards/" + fileName).toExternalForm());
        cardIv.setImage(image);

    }

    @FXML
    private void handleClose(ActionEvent event) {
        stage.close();
    }
}

