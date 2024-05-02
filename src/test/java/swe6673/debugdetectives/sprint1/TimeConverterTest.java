package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TimeConverterTest {
    @Test
    public void convertMinuteToSecond(){
        //purpose: test minute to second
        TimeConverter convert = new TimeConverter();

        //Test 1
        double expected = 60.0;
        double actual = convert.convertFrom(1.0, "minute", "second");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 0.06;
        actual = convert.convertFrom(0.001, "minute", "second");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 3
        expected = 3600.36;
        actual = convert.convertFrom(60.006, "minute", "second");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0;
        actual = convert.convertFrom(0.001, "minute", "second");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSecondToMinute(){
        //purpose: test minute to second at boundary value of 60.01
        TimeConverter convert = new TimeConverter();

        //Test 1
        double expected = 1.0001666667;
        double actual = convert.convertFrom(60.01, "second", "minute");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 0.00166667;
        actual = convert.convertFrom(0.1, "second", "minute");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 3
        expected = 1.66683333;
        actual = convert.convertFrom(100.01, "second", "minute");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 4
        expected = 99.9;
        actual = convert.convertFrom(5994, "second", "minute");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0;
        actual = convert.convertFrom(9999.99, "second", "minute");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMillisecondToWeek(){
        //purpose: test millisecond to week with large input value (maximum integer value)
        TimeConverter convert = new TimeConverter();

        //Test 1
        double expected = 3.5507335433;
        double actual = convert.convertFrom(2147483647, "millisecond", "week");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 0.01;
        actual = convert.convertFrom(6048000, "millisecond", "week");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 3
        expected = 0.00016534373347;
        actual = convert.convertFrom(99999.89, "millisecond", "week");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

    }
    @Test
    public void convertHourToDecade(){
        //purpose: test hour to decade with large negative input value (minimum integer value)
        TimeConverter convert = new TimeConverter();

        //Test 1
        double expected = -24498.377185;
        double actual = convert.convertFrom(-2147483647, "hour", "decade");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);


        //Test 2
        expected = 0.0001;
        actual = convert.convertFrom(8.76, "hour", "decade");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 3
        expected = 99.92361239450501;
        actual = convert.convertFrom(8759124, "hour", "decade");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 4
        expected = 0.0114257991;
        actual = convert.convertFrom(1000.9, "hour", "decade");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0;
        actual = convert.convertFrom(1000.9, "hour", "decade");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertDayToWeek(){
        //purpose: test day to week with decimal value
        TimeConverter convert = new TimeConverter();

        //Test 1
        double expected = 4.1285714286;
        double actual = convert.convertFrom(28.9, "day", "week");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 99.9;
        actual = convert.convertFrom(699.3, "day", "week");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0;
        actual = convert.convertFrom(699.3, "day", "week");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertCenturyToDecade(){
        //purpose: test century to decade with boundary value of 0.01
        TimeConverter convert = new TimeConverter();

        //Test 1
        double expected = 0.1;
        double actual = convert.convertFrom(0.01, "century", "decade");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 199.99;
        actual = convert.convertFrom(19.999, "century", "decade");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 3
        expected = 9.9;
        actual = convert.convertFrom(0.99, "century", "decade");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0;
        actual = convert.convertFrom(0.99, "century", "decade");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testFalsePositive(){
        //purpose: test time converter does not return false positive
        TimeConverter convert = new TimeConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(0.01, "millennium", "second");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testZeroValue(){
        //purpose: test time converter with zero value
        TimeConverter convert = new TimeConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(0.0, "week", "hour");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

}
