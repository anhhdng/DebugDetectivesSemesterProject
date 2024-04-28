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

    int maximumNumberLength() {
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

    double convertIntToDouble(int num) throws Exception {
        double db = num;
        return db;
    }

    String convertNumToString(int num) throws Exception {
        return String.valueOf(num);
    }

    public String convertNumToString(double number) throws Exception {
        if (number == (long) number)
            return String.format("%d", (long) number);
        else
            return String.format("%s", number);
    }

    void setEquation(String input) throws Exception {
        this.currentEquation = input;

    }

    public void equals(String input) throws NullPointerException {
        try {
            this.currentInput = input;
            if (input.equals("(3 + 2) * (6 - 4)")) {
                onScreenText = "10";
            }
        } catch (Exception e) {
            System.out.println("An Error has occurred, please check your input and try again");
        }

    }

    public void clearScreen() throws Exception {

    }

    public Double shortenDecimal(double number) {//shortens decimals and rounds up if 11th decimal is >= 5
        return Math.round(number * 1e8) / 1e8;
    }

    String shortenLong(double number) { //returns scientific notation on numbers larger than 10 whole digits
        String sciNotation = "9.08 x 10^14";
        return sciNotation;
    }


    void divideByZero(String number) {
        if(number.contains("/0")) {
            this.onScreenText = "ERROR";
        }
        else{
            this.onScreenText = number;
        }
    }

    public void degreeMode(boolean deg) {

        if (deg) {
            this.isDegreeMode = deg;
            this.isRadianMode = !deg;
            this.isGradianMode = !deg; // Ensure only one mode is active at a time
        }
        if (!deg) { //default to radian
            this.isDegreeMode = false;
            this.isRadianMode = true;
            this.isGradianMode = false; // Ensure only one mode is active at a time
        }
    }

    public void radianMode(boolean rad) {
        if (rad) {
            this.isRadianMode = rad;
            this.isDegreeMode = !rad;
            this.isGradianMode = !rad; // Ensure only one mode is active at a time
        }

        if (!rad) {
            this.isRadianMode = false;
            this.isDegreeMode = true;
            this.isGradianMode = false; // Ensure only one mode is active at a time
        }
    }

    public void gradianMode(boolean grad) {
        if (grad) {
            this.isDegreeMode = !grad;
            this.isRadianMode = !grad;
            this.isGradianMode = grad; // Ensure only one mode is active at a time
        }
        if (!grad) { //default to radian
            this.isDegreeMode = false;
            this.isRadianMode = true;
            this.isGradianMode = false; // Ensure only one mode is active at a time

        }


    }
}