package swe6673.debugdetectives.sprint1;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculusTest {


    // Power Rule Test
    @Test
    public void derviativeTestPowerRule() throws Exception {
        //purpose: To ensure that devivatives are accurately calculated
        Calculus function = new Calculus();

        //Test 1
        String actual = function.devivative("2x^2 + 3x - 2");
        String expected = "4x + 3";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = function.devivative("2x^4 + 9x^2 - 5");
        expected = "8x^3 + 18x";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = function.devivative("0x^10");
        expected = "1"; //Correct Answer is 0
        assertNotEquals("Error, test results are different than expected", expected, actual);

    }

    //Chain Rule Test
    @Test
    public void derviativeTestChainRule() throws Exception {
        //purpose: To ensure that devivatives are accurately calculated
        Calculus function = new Calculus();

        //Test 1
        String actual = function.devivative("(4x - 3)^5");
        String expected = "20(4x - 3)^4";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = function.devivative("(5 - 6x)^5");
        expected = "-30(5 - 6x)^4";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = function.devivative("(x^2 + 5)^8");
        expected = "8x(x^2 + 5)^7"; //Correct answer 16x(x^2 + 5)^7
        assertNotEquals("Error, test results are different than expected", expected, actual);

    }

    //Product Rule Test
    @Test
    public void derviativeTestProductRule() throws Exception {
        //purpose: To ensure that devivatives are accurately calculated
        Calculus function = new Calculus();


        //Test 1
        String actual = function.devivative("(x^2-1)(x+5)");
        String expected = "3x^2 + 10x + 1";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = function.devivative("(8x^4 - 9)(2x - 3)");
        expected = "80x^4 - 96x^3 - 18";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = function.devivative("(x^3)(6x-6)");
        expected = "24x^3 - 18x"; //Correct answer 24x^3 - 18x^2
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    //Quotient Rule Test
    @Test
    public void derviativeTestQuotientRule() throws Exception {
        //purpose: To ensure that devivatives are accurately calculated
        Calculus function = new Calculus();

        //Test 1
        String actual = function.devivative("(3x + 1) / (4x - 3)");
        String expected = "-13 / (4x-3)^2";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = function.devivative("(x+6) / (6x-9)");
        expected = "-5/(2x-3)^2";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = function.devivative("13x/(7x+1)");
        expected = ""; //Correct answer 13/(7x+1)^2
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    //Power Rule (integral)
    @Test
    public void integralTestPowerRule() throws Exception {
        //purpose: To ensure that integrals are accurately calculated
        Calculus function = new Calculus();

        //Test 1
        String actual = function.integral("4x + 3");
        String expected = "2x^2 + 3x + C";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = function.integral("7x^2 + 5x + 3");
        expected = "(7x^3)/3 + (5x^2)/2 + 3x + C";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = function.integral("7x^6");
        expected = "x^7"; //Correct Answer x^7 + C;
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    //Integration by parts
    @Test
    public void integrationByPartsTest() throws Exception {
        //purpose: To ensure that integrals are accurately calculated
        Calculus function = new Calculus();

        //Test 1
        String actual = function.integral("3x^2 + 10x + 1");
        String expected = "(x^3) + (5x^2) + x + C";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = function.integral("20(4x - 3)^4");
        expected = "(4x - 3)^5 + C";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = function.integral("2(5x - 5)^2");
        expected = "123"; //Correct Answer 2/15(5x - 5)^3 + C
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    // Integration by substitution
    @Test
    public void integrationBySubstiution() throws Exception {
        //purpose: To ensure that integrals are accurately calculated
        Calculus function = new Calculus();
        String actual = function.integral("20(4x - 3)^5");
        String expected = "5/6(4x - 3)^6 + C";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = function.integral("5(3x - 4)^2");
        expected = "5(3x^3 - 12x^2 + 16x) + C";
        assertEquals("Error, test results are different than expected", expected, actual);

        //False Positive Test
        actual = function.integral("-10 / (5x-3)^4");
        expected = "0"; //Correct Answer
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void derivativeNegativeTest() throws Exception{
        Calculus function = new Calculus();

        //Test 1
        String actual = function.devivative("a;loskdjf");
        String expected  = "ERROR";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = function.devivative("");
        expected  = "ERROR";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void integralNegativeTest() throws Exception{
        Calculus function = new Calculus();

        //Test 1
        String actual = function.integral("kjladsklj");
        String expected  = "ERROR";
        assertEquals("Error, test results are different than expected", expected, actual);

        //Test 2
        actual = function.devivative("");
        expected  = "ERROR";
        assertEquals("Error, test results are different than expected", expected, actual);
    }


}
