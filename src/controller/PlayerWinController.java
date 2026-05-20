package controller;

import au.edu.uts.ap.javafx.Controller;
import model.Player;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;

public class PlayerWinController extends Controller<Player> {
    @FXML private Text winnerTxt;
    @FXML private Text totalHealthTxt;

    @FXML
    private void initialize(){
        winnerTxt.setText(model.getName()+ " wins!");
        totalHealthTxt.setText("Total health: " + model.totalHealthProperty().get());
    }

    @FXML
    private void handleClose(ActionEvent event){
        stage.close();
    }
}
