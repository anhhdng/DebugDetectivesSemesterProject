package swe6673.debugdetectives.sprint1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;

    String onScreenText = "";
    String currentEquation = "";
    String currentInput = "";

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    int maximumNumberLength(){
        return 10;
    }
    boolean checkNumberLength(double number) throws Exception{
        return true;
    }

    double convertIntToDouble(int num) throws Exception{
        return 0.0;
    }

    String convertNumToString(int num) throws Exception{
        return "";
    }

    String convertNumToString(double num) throws Exception{
        return "";
    }

    void setEquation(String input)throws Exception{
        this.currentEquation = input;
    }

    public void equals(){

    }
    public void clearScreen(){

    }

    double shortenDecimal(double number){ //shortens decimals and rounds up if 11th decimal is >= 5
        return number;
    }

    String shortenLong(double number){ //returns scientific notation on numbers larger than 10 whole digits
        String sciNotation = "";
        return sciNotation;
    }

}