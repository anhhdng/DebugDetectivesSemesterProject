package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ExponentialTest {
    @Test
    public void SQRTTest() throws Exception {
        //purpose: To ensure square root is accurately calculated
        Exponential num = new Exponential();

        //Test 1
        double actual = num.squareRoot(16, 2);
        double expected = 4.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test2
        actual = num.squareRoot(16, 2);
        expected = 4.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        actual = num.squareRoot(8, 3);
        expected = 1.0;
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void natLogTest() throws Exception {
        //purpose: To ensure that natural log is accurately calculated
        Exponential num = new Exponential();

        //Test 1
        double actual = num.naturalLogarithm(10);
        double expected = 2.30258509;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);

        //Test 2
        actual = num.naturalLogarithm(2.718281);
        expected = 1.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);

        //False Positive Test
        actual = num.naturalLogarithm(1);
        expected = 1.0;
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.000003);

    }

    @Test
    public void logTest() throws Exception {
        //purpose: To ensure log base 10 is accurately calculated
        Exponential num = new Exponential();

        //Test 1
        double actual = num.base10Log(100);;
        double expected = 2.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.00003);

        //Test 2
        actual = num.base10Log(1000);;
        expected = 3.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.00003);

        //False Positive Test
        actual = num.base10Log(100);;
        expected = 1.9;
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.00003);
    }

    @Test
    public void exponentTest() throws Exception {
        //purpose: To ensure square root is accurately calculated
        Exponential num = new Exponential();

        //Test 1
        double actual = num.exponent(16, 2);;
        double expected = 4.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.00003);

        //Test 2
        actual = num.exponent(3125, 5);;
        expected = 5.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.00003);

        //False Positive
        actual = num.exponent(0, 0);;
        expected = 1.0;
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.00003);
    }



}
