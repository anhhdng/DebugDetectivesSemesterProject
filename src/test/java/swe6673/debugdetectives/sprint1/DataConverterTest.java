package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DataConverterTest {
    @Test
    public void convertBytesToKiloBytes(){
        //purpose: test bytes to kilobytes
        DataConverter convert = new DataConverter();

        //Test 1
        double expected = 1.0;
        double actual = convert.convertFrom(1024, "byte", "kilobyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 8.5;
        actual = convert.convertFrom(8704, "byte", "kilobyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 8.0;
        actual = convert.convertFrom(8000, "bite", "kilo");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertBitsToBytes(){
        //purpose: test bits to bytes at boundary point of 100.01
        DataConverter convert = new DataConverter();

        //Test 1
        double expected = 12.50125;
        double actual = convert.convertFrom(100.01, "bit", "byte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 100.0;
        actual = convert.convertFrom(800, "bit", "byte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0.0;
        actual = convert.convertFrom(80, "bit", "byte");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertGibibitsToGibibytes(){
        //purpose: test gigibits to gigibytes at boundary point of 0.01
        DataConverter convert = new DataConverter();

        //Test 1
        double expected = 0.00125;
        double actual = convert.convertFrom(0.01, "gigibit", "gigibyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 10.0;
        actual = convert.convertFrom(80.0, "gigibit", "gigibyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 80.0;
        actual = convert.convertFrom(80.0, "gigibit", "gigibyte");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);


    }
    @Test
    public void convertGigabitsToGigaByte(){
        //purpose: test gigabit to gigabyte with decimal value
        DataConverter convert = new DataConverter();

        //Test 1
        double expected = 4.387275	;
        double actual = convert.convertFrom(35.0982, "gigabit", "gigabyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 122.64375;
        actual = convert.convertFrom(981.15, "gigabit", "gigabyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 8;
        actual = convert.convertFrom(8, "gigabit", "gigabyte");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);


    }
    @Test
    public void testNegativeValue(){
        //purpose: test megabit to terabyte with negative value
        DataConverter convert = new DataConverter();

        //Test 1
        double expected = -0.0000074025	;
        double actual = convert.convertFrom(-59.22, "megabit", "terabyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 95.36743	;
        actual = convert.convertFrom(800000000, "megabit", "terabyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 1	;
        actual = convert.convertFrom(1024, "megabit", "terabyte");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testZeroValue(){
        //purpose: test data converter with zero value
        DataConverter convert = new DataConverter();
        double expected = 0.0	;
        double actual = convert.convertFrom(0.0, "megabyte", "terabit");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0.0	;
        actual = convert.convertFrom(10000.0, "megabyte", "terabit");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);


    }
    @Test
    public void testMaximumValue(){
        //purpose: test data converter with negative value
        DataConverter convert = new DataConverter();

        //Test 1
        double expected = 2097151.999;
        double actual = convert.convertFrom(2147483647 , "byte", "kilobyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 20971510.00;
        actual = convert.convertFrom(21474836470.0 , "byte", "kilobyte");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);

    }
    @Test
    public void testBoundary(){
        //purpose: test data converter with boundary value
        DataConverter convert = new DataConverter();

        //Test 1
        double expected = 0.999023 ;
        double actual = convert.convertFrom(1023 , "byte", "kilobyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 0.0009 ;
        actual = convert.convertFrom(1 , "byte", "kilobyte");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 1 ;
        actual = convert.convertFrom(0 , "byte", "kilobyte");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void testFalsePositive(){
        //purpose: test data converter does not return false positive
        DataConverter convert = new DataConverter();
        double expected = 0.0 ;
        double actual = convert.convertFrom(1023 , "megabyte", "kilobyte");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
}
