package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.*;

//Note that this class is not complete!
//This will only add 2 players to the game.
public class LoginController extends Controller<LoginModel> {

    @FXML private TextField player1Tf;
    @FXML private TextField player2Tf;
    @FXML private TextField player3Tf;
    @FXML private TextField player4Tf;

    @FXML
    private void initialize() {
        player1Tf.setText("Davey");
        player2Tf.setText("Jenny");
        player1Tf.setEditable(false);
        player2Tf.setEditable(false);
    }

    private LoginModel getLoginModel() {
        return model;
    }

    @FXML
    private void handleStart(ActionEvent event) {
        getLoginModel().addToGame(new Player(player1Tf.getText()));
        getLoginModel().addToGame(new Player(player2Tf.getText()));

        String player3Name = player3Tf.getText().trim();

        if (!player3Name.isEmpty()){
            getLoginModel().addToGame(new Player(player3Name));
        }

        String player4Name = player4Tf.getText().trim();

        if (!player4Name.isEmpty()){
            getLoginModel().addToGame(new Player(player4Name));
        }
        
        ViewLoader.showStage(new Dealer(getLoginModel().getPlayers()), "/view/DealerView.fxml", "Dealer", stage);
    }
}
