package swe6673.debugdetectives.sprint1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Before.*;

public class ControllerTest {

    @Test
    public void checkNumberLengthFalse() throws Exception {
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded

        //Test 1
        boolean actual = numberLength.checkNumberLength(10000000000.0); //10,000,000,000 eleven digits
        boolean expected = false;
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = numberLength.checkNumberLength(100000000000.0); //100,000,000,000 twelve digits
        expected = false;
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = numberLength.checkNumberLength(5);
        expected = false;
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }
    @Test
    public void checkNumberLengthTrue() throws Exception {
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded

        //Test 1
        boolean actual = numberLength.checkNumberLength(100000000.0); //100,000,000 9 digits
        boolean expected = true;
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = numberLength.checkNumberLength(1000000000.0); //1,000,000,000 10 digits
        expected = true;
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = numberLength.checkNumberLength(5);
        expected = false;
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }


    @Test
    public void checkDecimalLengthFalse() throws Exception {
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded

        //Test 1
        boolean actual = numberLength.checkNumberLength(0.00000000008); // eleven decimals and one whole number
        boolean expected = false;
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = numberLength.checkNumberLength(7.00000004136); // eleven decimals and one whole number
        expected = false;
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = numberLength.checkNumberLength(1.0); // 1 decimal and one whole number
        expected = false;
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void checkDecimalLengthTrue() throws Exception {
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded

        //Test 1
        boolean actual = numberLength.checkNumberLength(9.000000008); // ten decimals and one whole number
        boolean expected = true;
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = numberLength.checkNumberLength(79.00000004); // ten decimals and one whole number
        expected = true;
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = numberLength.checkNumberLength(1.020395687223823239823); // 21 decimals and one whole number
        expected = true;
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void covertIntToDoublePositive() throws Exception {
        //purpose to check to see if Intergers can be converted to Doubles if needed
        Controller number = new Controller();

        //Test 1
        double actual = number.convertIntToDouble(36);
        double expected = 36.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.0000003);

        //Test 2
        actual = number.convertIntToDouble(238943);
        expected = 238943.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.0000003);

        //False Positive Test
        actual = number.convertIntToDouble(2);
        expected = 1.999999;
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0000003);
    }

    @Test
    public void covertIntToDoubleNegative() throws Exception {
        //purpose to check to see if Intergers can be converted to Doubles if needed
        Controller number = new Controller();

        //Test 1
        double actual = number.convertIntToDouble(-14);
        double expected = -14.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.0000003);

        //Test 2
        actual = number.convertIntToDouble(-43);
        expected = -43.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.0000003);

        //False Positive Test
        actual = number.convertIntToDouble(-22);
        expected = 22.0;
        assertNotEquals("Error, test results are different than expected", expected, actual,0.0000003);
    }

    @Test
    public void clearScreen() throws Exception {
        //purpose to check to see if screen can be cleared
        Controller clear = new Controller();

        //Test 1
        String actual = clear.onScreenText;
        String expected = "";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = clear.onScreenText;
        expected = " ";
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void convertDoubleToString() throws Exception {
        //purpose to check to ensure doubles are converted to string
        Controller dub = new Controller();

        //Test 1
        String actual = dub.convertNumToString(44.0);
        String expected = "44";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = dub.convertNumToString(1.0);
        expected = "1";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = dub.convertNumToString(1.0);
        expected = "1.0";
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void convertIntToString() throws Exception {
        //purpose to check to ensure doubles are converted to string
        Controller int_ = new Controller();

        //Test 1
        String actual = int_.convertNumToString(44);
        String expected = "44";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = int_.convertNumToString(005);
        expected = "5";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = int_.convertNumToString(-8);
        expected = "8";
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void storeInput() throws Exception {
        //purpose to ensure that on screen text is being properly stored once a modifier key is pressed
        Controller num = new Controller();

        //Test 1
        num.setEquation("630*3+99");
        String actual = num.currentEquation;
        String expected = "630*3+99";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        num.setEquation("(0*2-11)/3");
        actual = num.currentEquation;
        expected = "(0*2-11)/3";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        num.setEquation(null);
        actual = num.currentEquation;
        expected = "";
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void equalsButton() throws Exception {
        //purpose: to ensure that the correct equation was sent for processing
        Controller equation = new Controller();

        //Test 1
        equation.equals("4 x 3 + 8");
        String actual = equation.currentInput;
        String expected = "4 x 3 + 8";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        equation.equals("1+1+5-13");
        actual = equation.currentInput;
        expected = "1+1+5-13";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        equation.equals(null);
        actual = equation.currentInput;
        expected = "";
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void Parenthesis() throws Exception {
        //purpose: to ensure that the program calculates equations with parenthesis accurately
        Controller equation = new Controller();

        //Test 1
        equation.equals("(3 + 2) * (6 - 4)");
        String actual = equation.onScreenText;
        String expected = "10";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        equation.equals("(9 / 3) * (1 + 8)");
        actual = equation.onScreenText;
        expected = "27";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        equation.equals("(4 - 2) * (99 + 1)");
        actual = equation.onScreenText;
        expected = "";
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void PEDMAS() throws Exception {
        //purpose to test to ensure that the calculator follows the PEDMAS mathmatic rule
        Controller equation = new Controller();

        //Test 1
        equation.equals("2 + 5 - 3 * 8"); //-14 w/ pedmas 24 w/o pedmas
        String actual = equation.onScreenText;
        String expected = "14";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        equation.equals("8 + 9 - 7 * 10"); //-14 w/ pedmas 24 w/o pedmas
        actual = equation.onScreenText;
        expected = "-54";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        equation.equals("5 + 2 - 8 * 3"); //-14 w/ pedmas 24 w/o pedmas
        actual = equation.onScreenText;
        expected = "-3";
        assertNotEquals("Error, test results are different than expected", expected, actual);

    }

    @Test
    public void shortenDecimalWithRound() throws Exception {
        //purpose to ensure that number is shorter than max number of characters on screen and rounds up if 11th number =>5
        Controller num = new Controller();

        //Test 1
        Double actual = num.shortenDecimal(38.123456789);
        Double expected = 38.12345679;
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = num.shortenDecimal(0.238563914275);
        expected = 0.23856391428;
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = num.shortenDecimal(1.0);
        expected = 1.0;
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void shortenDecimalNoRound() throws Exception {
        //purpose to ensure that number is shorter than max number of characters on screen and does not rounds up if 11th number < 5
        Controller num = new Controller();

        //Test 1
        Double actual = num.shortenDecimal(38.123456781);
        Double expected = 38.12345678;
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = num.shortenDecimal(0.238563914274);
        expected = 0.23856391427;
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = num.shortenDecimal(1.0);
        expected = 1.0;
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void shortenLong() throws Exception {
        //purpose to ensure that number is shorter than max number of characters on screen and rounds up if 11th number =>5
        Controller num = new Controller();

        //Test 1
        String actual = num.shortenLong(90876543219999.0);
        String expected = "9.08 x 10^14";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = num.shortenLong(1151623463488.0);
        expected = "1.15 x 10^12";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = num.shortenLong(1.0);
        expected = "1.0 x 10^1";
        assertNotEquals("Error, test results are different than expected", expected, actual);

    }

    @Test
    public void divideByZero() throws Exception {
        //purpose: To ensure that an error is thrown if user attempts to divide by zero
        Controller num = new Controller();

        //Test 1
        num.divideByZero("3/0");
        String actual = num.onScreenText;
        String expected = "ERROR";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        num.divideByZero("15/0");
        actual = num.onScreenText;
        expected = "ERROR";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        num.divideByZero("3/4");
        actual = num.onScreenText;
        expected = "ERROR";
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void degreeModeTest() throws Exception{
        //purpose: to ensure that degrees are used during calulation of trig functions
        Controller deg = new Controller();

        //Test 1
        deg.degreeMode(true);
        boolean actual = deg.isDegreeMode;
        boolean expected = true;
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        deg.degreeMode(false);
        actual = deg.isDegreeMode;
        expected = false;
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        deg.degreeMode(true);
        actual = deg.isDegreeMode;
        expected = false;
        assertNotEquals("Error, test results are different than expected", expected, actual);

    }

    @Test
    public void radianModeTest() throws Exception{
        //purpose: to ensure that degrees are used during calulation of trig functions
        Controller deg = new Controller();

        //Test 1
        deg.radianMode(true);
        boolean actual = deg.isRadianMode;
        boolean expected = true;
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        deg.radianMode(false);
        actual = deg.isRadianMode;
        expected = false;
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        deg.radianMode(true);
        actual = deg.isRadianMode;
        expected = false;
        assertNotEquals("Error, test results are different than expected", expected, actual);


    }

    @Test
    public void gradianModeTest() throws Exception{
        //purpose: to ensure that degrees are used during calulation of trig functions
        Controller deg = new Controller();

        //Test 1
        deg.gradianMode(true);
        boolean actual = deg.isGradianMode;
        boolean expected = true;
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        deg.gradianMode(false);
        actual = deg.isGradianMode;
        expected = false;
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        deg.gradianMode(true);
        actual = deg.isGradianMode;
        expected = false;
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

}
