package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;

public class ErrorController extends Controller<Exception> {
    @FXML private Text errorTypeTxt;
    @FXML private Text messageTxt;

    @FXML
    private void initialize() {
        errorTypeTxt.setText(model.getClass().getSimpleName());
        messageTxt.setText(model.getMessage());
    }

    @FXML
    private void handleClose(ActionEvent event) {
        stage.close();
    }
}
