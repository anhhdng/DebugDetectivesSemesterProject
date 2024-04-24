package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AreaConverterTest {
    @Test
    public void convertSquareMeterToSquareCentimeterPositive(){
        //purpose: test square meter to square centimeter
        AreaConverter convert = new AreaConverter();

        //Test #1
        double expected = 10000.0;
        double actual = convert.convertFrom(1.0, "meter", "centimeter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test #2
        expected = 990000.0;
        actual = convert.convertFrom(99.0, "meter", "centimeter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void convertSquareMeterToSquareCentimeterNegative(){
        //purpose: to test negative inputs
        AreaConverter convert = new AreaConverter();
        double expected = 1.0;
        double actual = convert.convertFrom(10000.0, "Meter", "Ccentimeter");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }


    @Test
    public void convertSquareCentimeterToSquareMeter(){
        //purpose: test square centimeter to square meter
        AreaConverter convert = new AreaConverter();
        //Test 1
        double expected = 0.5;
        double actual = convert.convertFrom(5000.0, "centimeter", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
        //Test 2
        expected = 18;
        actual = convert.convertFrom(180000.0, "centimeter", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void convertSquareCentimeterToSquareMeterNegative(){
        //purpose: to test negative inputs
        AreaConverter convert = new AreaConverter();
        double expected = 0.5;
        double actual = convert.convertFrom(50000.0, "Cce", "Mmeter");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSquareMeterToSquareFoot(){
        //test square meter to square foot with small decimal value below 1
        AreaConverter convert = new AreaConverter();

        //Test 1
        double expected = 5.38196;
        double actual = convert.convertFrom(0.5, "meter", "foot");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 27.5555;
        actual = convert.convertFrom(2.56, "meter", "foot");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void convertSquareMeterToSquareFootNegative(){
        //purpose: to test negative inputs
        AreaConverter convert = new AreaConverter();
        double expected = 5.38196;
        double actual = convert.convertFrom(0.5, "meter", "foot.");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);

    }
    @Test
    public void convertSquareFootToSquareMeter(){
        //purpose: test square foot to square meter
        AreaConverter convert = new AreaConverter();

        //Test 1
        double expected = 9.2903;
        double actual = convert.convertFrom(100.0, "foot", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 5.249;
        actual = convert.convertFrom(56.5, "foot", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void convertSquareFootToSquareMeterNegative(){
        //purpose: to test negative inputs
        AreaConverter convert = new AreaConverter();
        double expected = 9.2903;
        double actual = convert.convertFrom(100.0, "foot", " meter");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void convertSquareKilometerToSquareMile(){
        //purpose: test square kilometer to square mile
        AreaConverter convert = new AreaConverter();

        //Test 1
        double expected = 3.86102;
        double actual = convert.convertFrom(10, "kilometer", "mile");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 21.2356;
        actual = convert.convertFrom(55, "kilometer", "mile");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void convertSquareKilometerToSquareMileNegative(){
        //purpose: to test negative inputs
        AreaConverter convert = new AreaConverter();
        double expected = 3.86102;
        double actual = convert.convertFrom(10, "", "mile");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSquareMileToSquareKilometer(){
        //purpose: test square mile to square kilometer
        AreaConverter convert = new AreaConverter();

        //Test 1
        double expected = 129.500;
        double actual = convert.convertFrom(50.0, "mile", "kilometer");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 8.0808;
        actual = convert.convertFrom(3.12, "mile", "kilometer");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void convertSquareMileToSquareKilometerNegative(){
        //purpose: to test negative inputs
        AreaConverter convert = new AreaConverter();
        double expected = 129.500;
        double actual = convert.convertFrom(50.0, "mile", "1");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSquareInchToSquareMeter(){
        //purpose: test square inch to square meter conversion
        AreaConverter convert = new AreaConverter();

        //Test 1
        double expected = 0.25174143;
        double actual = convert.convertFrom(390.2, "inch", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 5.8116;
        actual = convert.convertFrom(9008, "inch", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSquareInchToSquareMeterNegative() {
        //purpose: to test negative inputs
        AreaConverter convert = new AreaConverter();

        //Test 1
        double expected = 0.25174143;
        double actual = convert.convertFrom(390.2, "Inch", "meter");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
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

        //Test 1
        double expected = 1203.0;
        double actual = convert.convertFrom(1203.0, "meter", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 88.125;
        actual = convert.convertFrom(88.125, "meter", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void convertSameUnitNegative() {
        //purpose: to test negative inputs
        AreaConverter convert = new AreaConverter();

        //Test 1
        double expected = -1203;
        double actual = convert.convertFrom(-1203.5, "meter", "meter");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testFalsePositive(){
        //purpose: test area conversion does not return false positive
        AreaConverter convert = new AreaConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(10.0, "kilometer", "mile");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testBoundaryNegative(){
        //purpose: test area conversion with value just below zero
        AreaConverter convert = new AreaConverter();
        double expected = -0.01;
        double actual = convert.convertFrom(-0.01, "kilometer", "mile");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testBoundaryPositive(){
        //purpose: test area conversion with value just above zero
        AreaConverter convert = new AreaConverter();
        double expected = 0.01;
        double actual = convert.convertFrom(0.01, "kilometer", "mile");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
}
