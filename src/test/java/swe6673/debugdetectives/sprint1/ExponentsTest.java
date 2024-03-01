package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExponentsTest {
    @Test
    public void SQRTTest() throws Exception {
        //purpose: To ensure square root is accurately calculated
        Exponents num = new Exponents();
        Double actual = num.squareRoot(16, 2);
        Double expected = 4.0;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void natLogTest() throws Exception {
        //purpose: To ensure that natural log is accurately calculated
        Exponents num = new Exponents();
        Double actual = num.naturalLogarithm(10);
        Double expected = 2.30258509;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }

    @Test
    public void logTest() throws Exception {
        //purpose: To ensure log base 10 is accurately calculated
        Exponents num = new Exponents();
        Double actual = num.base10Log(100);;
        Double expected = 2.0;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void exponentTest() throws Exception {
        //purpose: To ensure square root is accurately calculated
        Exponents num = new Exponents();
        Double actual = num.exponent(16, 2);;
        Double expected = 4.0;
        assertEquals("Error, test results are different than expected", expected, actual);
    }



}
