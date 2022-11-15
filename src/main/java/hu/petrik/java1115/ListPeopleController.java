package hu.petrik.java1115;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ListPeopleController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}