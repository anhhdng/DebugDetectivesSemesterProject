package swe6673.debugdetectives.sprint1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    int maximumNumberLength(){
        return 10;
    }
    boolean checkNumberLength(double number){
        return true;
    }
}