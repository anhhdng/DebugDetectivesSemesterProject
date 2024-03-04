package swe6673.debugdetectives.sprint1;



import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculusTest {


    // Power Rule Test
    @Test
    public void derviativeTestPowerRule() throws Exception {
        //purpose: To ensure that devivatives are accurately calculated
        Calculus function = new Calculus();
        String actual = function.devivative("2x^2 + 3x - 2");
        String expected = "4x + 3";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    //Chain Rule Test
    @Test
    public void derviativeTestChainRule() throws Exception {
        //purpose: To ensure that devivatives are accurately calculated
        Calculus function = new Calculus();
        String actual = function.devivative("(4x - 3)^5");
        String expected = "20(4x - 3)^4";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    //Product Rule Test
    @Test
    public void derviativeTestProductRule() throws Exception {
        //purpose: To ensure that devivatives are accurately calculated
        Calculus function = new Calculus();
        String actual = function.devivative("(x^2-1)(x+5)");
        String expected = "3x^2 + 10x + 1";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    //Quotient Rule Test
    @Test
    public void derviativeTestQuotientRule() throws Exception {
        //purpose: To ensure that devivatives are accurately calculated
        Calculus function = new Calculus();
        String actual = function.devivative("(3x + 1) / (4x - 3)");
        String expected = "-13 / (4x-3)^2";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    //Power Rule (integral)
    @Test
    public void integralTestPowerRule() throws Exception {
        //purpose: To ensure that integrals are accurately calculated
        Calculus function = new Calculus();
        String actual = function.integral("4x + 3");
        String expected = "2x^2 + 3x + C";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    //Integration by parts
    @Test
    public void integrationByPartsTest() throws Exception {
        //purpose: To ensure that integrals are accurately calculated
        Calculus function = new Calculus();
        String actual = function.integral("3x^2 + 10x + 1");
        String expected = "(x^2-1)(x+5) + C";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    // Integration by substitution
    @Test
    public void integrationBySubstiution() throws Exception {
        //purpose: To ensure that integrals are accurately calculated
        Calculus function = new Calculus();
        String actual = function.integral("20(4x - 3)^4");
        String expected = "(4x - 3)^5 + C";
        assertEquals("Error, test results are different than expected", expected, actual);
    }


}
