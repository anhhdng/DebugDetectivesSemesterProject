package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class LengthConverterTest {
    @Test
    public void convertMeterToCentimeter(){
        LengthConverter convert = new LengthConverter();
        double expected = 1000.0;
        double actual = convert.convertFrom(10.0, "meter", "centimeter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToKilometer(){
        LengthConverter convert = new LengthConverter();
        double expected = 0.01;
        double actual = convert.convertFrom(10.0, "meter", "kilometer");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToMillimeter(){
        LengthConverter convert = new LengthConverter();
        double expected = 10000.0;
        double actual = convert.convertFrom(10.0, "meter", "millimeter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToMile(){
        LengthConverter convert = new LengthConverter();
        double expected = 0.000621371;
        double actual = convert.convertFrom(10.0, "meter", "mile");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToYard(){
        LengthConverter convert = new LengthConverter();
        double expected = 1.09361;
        double actual = convert.convertFrom(10.0, "meter", "yard");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToFoot(){
        LengthConverter convert = new LengthConverter();
        double expected = 3.28084;
        double actual = convert.convertFrom(10.0, "meter", "foot");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToInch(){
        LengthConverter convert = new LengthConverter();
        double expected = 39.3701;
        double actual = convert.convertFrom(10.0, "meter", "inch");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertNegativeNumbers() {
        //purpose: test length conversion with negative input number
        LengthConverter convert = new LengthConverter();
        double expected = -40000.0;
        double actual = convert.convertFrom(-400.0, "meter", "centimeter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertDecimalValues(){
        //purpose: test length conversion with decimal value
        LengthConverter convert = new LengthConverter();
        double expected = 25.22767;
        double actual = convert.convertFrom(40.6, "kilometer", "mile");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertZeroValues(){
        //purpose: test length conversion with zero input value
        LengthConverter convert = new LengthConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(0.0, "inch", "foot");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertLargeValues(){
        //purpose: test length conversion with large values
        LengthConverter convert = new LengthConverter();
        double expected = 621371192.1752;
        double actual = convert.convertFrom(999999999.9, "meter", "mile");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testFalsePositive(){
        //purpose: test length conversion does not return false positive
        LengthConverter convert = new LengthConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(4340.0, "centimeter", "meter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testBoundaryPositive(){
        //purpose: test length conversion with value just above zero
        LengthConverter convert = new LengthConverter();
        double expected = 38.97638;
        double actual = convert.convertFrom(0.01, "meter", "inch");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testBoundaryNegative(){
        //purpose: test length conversion with value just below zero
        LengthConverter convert = new LengthConverter();
        double expected = -38.97638;
        double actual = convert.convertFrom(-0.01, "meter", "inch");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

}
