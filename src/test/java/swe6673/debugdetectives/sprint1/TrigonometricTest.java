package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrigonometricTest {


    @Test
    public void sinTest() throws Exception {
        //purpose: To ensure that SIN is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.sin(90);
        Double expected = 1.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }@Test
    public void cosTest() throws Exception {
        //purpose: To ensure that COS is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.cos(0);
        Double expected = 1.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }@Test
    public void tanTest() throws Exception {
        //purpose: To ensure that tan is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.tan(45);
        Double expected = 1.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }@Test
    public void secTest() throws Exception {
        //purpose: To ensure that sec is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.sec(0);
        Double expected = 1.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }@Test
    public void cscTest() throws Exception {
        //purpose: To ensure that csc is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.csc(90);
        Double expected = 1.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }@Test
    public void cotTest() throws Exception {
        //purpose: To ensure that cot is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.cot(45);
        Double expected = 1.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }@Test
    public void arcsinTest() throws Exception {
        //purpose: To ensure that arcsin is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.arcsin(180);
        Double expected = 90.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }@Test
    public void arccosTest() throws Exception {
        //purpose: To ensure that arccos is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.arccos(0);
        Double expected = 90.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }@Test
    public void arctanTest() throws Exception {
        //purpose: To ensure that arctan is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.arctan(180);
        Double expected = 45.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }@Test
    public void arcsecTest() throws Exception {
        //purpose: To ensure that arcsec is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.arcsec(180);
        Double expected = 0.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }@Test
    public void arccscTest() throws Exception {
        //purpose: To ensure that arccsc is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.arccsc(180);
        Double expected = 90.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }@Test
    public void arccotTest() throws Exception {
        //purpose: To ensure that arccot is accurately calculated
        Trigonometric num = new Trigonometric();
        Double actual = num.arccot(180);
        Double expected = 45.0;
        assertEquals("Error, test results are different than expected", expected, actual, 0.000003);
    }
}
