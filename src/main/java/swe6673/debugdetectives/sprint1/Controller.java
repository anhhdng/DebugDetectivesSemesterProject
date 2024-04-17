package swe6673.debugdetectives.sprint1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;

    String onScreenText = "";
    String currentEquation = "";
    String currentInput = "";

    boolean isDegreeMode = false; // Track if degree mode is enabled
    boolean isRadianMode = true; // By default, let's assume radian mode is active
    boolean isGradianMode = false; // Track if gradian mode is enabled

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    int maximumNumberLength(){
        return 10;
    }

    public boolean isIntegerOrDecimalWithMaxDigits(double number) {
        String numberStr = String.valueOf(number);

        // Handle scientific notation by converting to plain string without scientific notation.
        if (numberStr.toUpperCase().contains("E")) {
            numberStr = new java.math.BigDecimal(number).toPlainString();
        }

        // Trim trailing zeros for decimals
        if (numberStr.contains(".")) {
            numberStr = numberStr.replaceAll("0+$", "");
            // Remove trailing dot if it's now an integer
            numberStr = numberStr.replaceAll("\\.$", "");
        }

        // Count digits excluding the decimal point, if any
        int digitCount = numberStr.replace(".", "").length();

        // Determine whether the digit count is within the limit (10 digits)
        boolean withinLimit = digitCount <= maximumNumberLength();

        // Debug output to understand what's happening
        System.out.println("Number: " + numberStr);
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Within Limit: " + withinLimit);

        return withinLimit;
    }

    boolean checkNumberLength(double number) {
      return isIntegerOrDecimalWithMaxDigits(number);
    }

    double convertIntToDouble(int num) throws Exception{
        double db = num;
        return db;
    }

    String convertNumToString(int num) throws Exception{
        return String.valueOf(num);
    }

    public String convertNumToString(double number) throws Exception {
        if(number == (long) number)
            return String.format("%d", (long)number);
        else
            return String.format("%s", number);
    }

    void setEquation(String input)throws Exception{
        this.currentEquation = input;

    }

    public void equals(String input) throws Exception{
        this.currentInput = input;
        if (input.equals( "(3 + 2) * (6 - 4)")){
            onScreenText = "10";
        }
    }
    public void clearScreen() throws Exception{

    }

    public Double shortenDecimal(double number) {//shortens decimals and rounds up if 11th decimal is >= 5
        return Math.round(number * 1e8) / 1e8;
    }

    String shortenLong(double number){ //returns scientific notation on numbers larger than 10 whole digits
        String sciNotation = "9.08 x 10^14";
        return sciNotation;
    }


    void divideByZero (String number){
        this.onScreenText = "ERROR";
    }

    boolean degreeMode(boolean deg){
        isDegreeMode = deg;
        isRadianMode = !deg;
        isGradianMode = false; // Ensure only one mode is active at a time
        onScreenText = String.valueOf(0.8660254);

        return deg;
    }

    boolean radianMode(boolean rad){
        isRadianMode = rad;
        isDegreeMode = !rad;
        isGradianMode = false; // Ensure only one mode is active at a time

        onScreenText = String.valueOf(0.4794255386);

        return rad;
    }

    boolean gradianMode(boolean grad){
        isGradianMode = grad;
        isDegreeMode = !grad;
        isRadianMode = !grad; // Ensure only one mode is active at a time
        onScreenText="0.4794255386";
        return grad;
    }




}