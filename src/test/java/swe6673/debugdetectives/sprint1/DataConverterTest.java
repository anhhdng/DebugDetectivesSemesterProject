package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataConverterTest {
    @Test
    public void convertBytesToKiloBytes(){
        //purpose: test bytes to kilobytes
        DataConverter convert = new DataConverter();
        double expected = 1.0;
        double actual = convert.convertFrom(1024, "byte", "kiloByte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertBitsToBytes(){
        //purpose: test bits to bytes at boundary point of 100.01
        DataConverter convert = new DataConverter();
        double expected = 12.50125;
        double actual = convert.convertFrom(100.01, "bit", "byte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertGibibitsToGibibytes(){
        //purpose: test gigibits to gigibytes at boundary point of 0.01
        DataConverter convert = new DataConverter();
        double expected = 0.00125;
        double actual = convert.convertFrom(0.01, "gigibit", "gigibyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertGigabitsToGigaByte(){
        //purpose: test gigabit to gigabyte with decimal value
        DataConverter convert = new DataConverter();
        double expected = 4.387275	;
        double actual = convert.convertFrom(35.0982, "gigabit", "gigabyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testNegativeValue(){
        //purpose: test megabit to terabyte with negative value
        DataConverter convert = new DataConverter();
        double expected = -0.0000074025	;
        double actual = convert.convertFrom(-59.22, "megabit", "terabyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testZeroValue(){
        //purpose: test data converter with zero value
        DataConverter convert = new DataConverter();
        double expected = 0.0	;
        double actual = convert.convertFrom(0.0, "megabyte", "terabit");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testMaximumValue(){
        //purpose: test data converter with negative value
        DataConverter convert = new DataConverter();
        double expected = 2097151.00;
        double actual = convert.convertFrom(2147483647 , "byte", "kilobyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testBoundary(){
        //purpose: test data converter with boundary value
        DataConverter convert = new DataConverter();
        double expected = 0.999023 ;
        double actual = convert.convertFrom(1023 , "byte", "kilobyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testFalsePositive(){
        //purpose: test data converter does not return false positive
        DataConverter convert = new DataConverter();
        double expected = 0.0 ;
        double actual = convert.convertFrom(1023 , "megabyte", "kilobyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
}
