package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreaConverterTest {
    @Test
    public void convertSquareMeterToSquareCentimeter(){
        //purpose: test square meter to square centimeter
        AreaConverter convert = new AreaConverter();
        double expected = 10000.0;
        double actual = convert.convertFrom(10.0, "centimeter", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSquareCentimeterToSquareMeter(){
        //purpose: test square centimeter to square meter
        AreaConverter convert = new AreaConverter();
        double expected = 0.5;
        double actual = convert.convertFrom(5000.0, "centimeter", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSquareMeterToSquareFoot(){
        //test square meter to square foot with small decimal value below 1
        AreaConverter convert = new AreaConverter();
        double expected = 5.38196;
        double actual = convert.convertFrom(0.5, "meter", "foot");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSquareFootToSquareMeter(){
        //purpose: test square foot to square meter
        AreaConverter convert = new AreaConverter();
        double expected = 9.2903;
        double actual = convert.convertFrom(100.0, "foot", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSquareKilometerToSquareMile(){
        //purpose: test square kilometer to square mile
        AreaConverter convert = new AreaConverter();
        double expected = 3.86102;
        double actual = convert.convertFrom(10, "kilometer", "mile");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSquareMileToSquareKilometer(){
        //purpose: test square mile to square kilometer
        AreaConverter convert = new AreaConverter();
        double expected = 129.499;
        double actual = convert.convertFrom(50.0, "mile", "kilometer");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSquareInchToSquareMeter(){
        //purpose: test square inch to square meter conversion
        AreaConverter convert = new AreaConverter();
        double expected = 0.25174143;
        double actual = convert.convertFrom(390.2, "inch", "Meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSquareAcreToSquareHectare(){
        //purpose: test acre to hectare conversion with decimal values
        AreaConverter convert = new AreaConverter();
        double expected = 12.5448502;
        double actual = convert.convertFrom(30.999, "acre", "hectare");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSameUnit(){
        //purpose: test area conversion with same unit
        AreaConverter convert = new AreaConverter();
        double expected = 1203.0;
        double actual = convert.convertFrom(1203.0, "meter", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testFalsePositive(){
        //purpose: test area conversion does not return false positive
        AreaConverter convert = new AreaConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(10.0, "kilometer", "mile");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testBoundaryNegative(){
        //purpose: test area conversion with value just below zero
        AreaConverter convert = new AreaConverter();
        double expected = -0.01;
        double actual = convert.convertFrom(-0.01, "kilometer", "mile");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testBoundaryPositive(){
        //purpose: test area conversion with value just above zero
        AreaConverter convert = new AreaConverter();
        double expected = 0.01;
        double actual = convert.convertFrom(0.01, "kilometer", "mile");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
}
