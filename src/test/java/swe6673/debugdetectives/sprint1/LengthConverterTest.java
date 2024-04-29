package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import java.util.Formatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthConverterTest {
    @Test
    public void convertMeterToCentimeter(){
        //purpose: test meter to centimeter conversion
        LengthConverter convert = new LengthConverter();
        double expected = 1000.0;
        double actual = convert.convertFrom(10.0, "meter", "centimeter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToKilometer(){
        //purpose: test meter to kilometer
        LengthConverter convert = new LengthConverter();
        double expected = 0.01;
        double actual = convert.convertFrom(10.0, "meter", "kilometer");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToMillimeter(){
        //purpose: test meter to millimeter
        LengthConverter convert = new LengthConverter();
        double expected = 10000.0;
        double actual = convert.convertFrom(10.0, "meter", "millimeter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToMile(){
        //purpose: test meter to mile with long decimal point output
        LengthConverter convert = new LengthConverter();
        double expected = 0.006213711922373339;
        double actual = convert.convertFrom(10.0, "meter", "mile");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToYard(){
        //purpose: test meter to yard
        LengthConverter convert = new LengthConverter();
        double expected = 1.09361;
        double actual = convert.convertFrom(10.0, "meter", "yard");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToFoot(){
        //purpose: test meter to foot
        LengthConverter convert = new LengthConverter();
        double expected = 3.28084;
        double actual = convert.convertFrom(10.0, "meter", "foot");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMeterToInch(){
        //test meter to inch
        LengthConverter convert = new LengthConverter();
        double expected = 393.701;
        double actual = convert.convertFrom(10.0, "meter", "inch");
        Formatter fmt = new Formatter();
        fmt = fmt.format("%.3f", actual);
        assertEquals("Error, test results are different than expected", expected, Double.valueOf(String.valueOf(fmt)), 0.0003);
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
        double expected = 621371.1921752;
        double actual = convert.convertFrom(999999999.9, "meter", "mile");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testFalsePositive(){
        //purpose: test length conversion does not return false positive
        LengthConverter convert = new LengthConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(4340.0, "centimeter", "meter");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testBoundaryPositive(){
        //purpose: test length conversion with value just above zero
        LengthConverter convert = new LengthConverter();
        double expected = 0.3937008;
        double actual = convert.convertFrom(0.01, "meter", "inch");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testBoundaryNegative(){
        //purpose: test length conversion with value just below zero
        LengthConverter convert = new LengthConverter();
        double expected = -0.3937008;
        double actual = convert.convertFrom(-0.01, "meter", "inch");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

}
