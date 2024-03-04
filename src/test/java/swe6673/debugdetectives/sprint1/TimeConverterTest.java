package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeConverterTest {
    @Test
    public void convertMinuteToSecond(){
        //purpose: test minute to second
        TimeConverter convert = new TimeConverter();
        double expected = 60.0;
        double actual = convert.convertFrom(1.0, "minute", "second");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSecondToMinute(){
        //purpose: test minute to second at boundary value of 60.01
        TimeConverter convert = new TimeConverter();
        double expected = 1.0001666667;
        double actual = convert.convertFrom(60.01, "second", "minute");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMillisecondToWeek(){
        //purpose: test millisecond to week with large input value (maximum integer value)
        TimeConverter convert = new TimeConverter();
        double expected = 3.5507335433;
        double actual = convert.convertFrom(2147483647, "millisecond", "week");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertHourToDecade(){
        //purpose: test hour to decade with large negative input value (minimum integer value)
        TimeConverter convert = new TimeConverter();
        double expected = -24497.874139;
        double actual = convert.convertFrom(-2147483647, "hour", "decade");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertDayToWeek(){
        //purpose: test day to week with decimal value
        TimeConverter convert = new TimeConverter();
        double expected = 4.1285714286;
        double actual = convert.convertFrom(28.9, "day", "week");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertCenturyToDecade(){
        //purpose: test century to decade with boundary value of 0.01
        TimeConverter convert = new TimeConverter();
        double expected = 0.1;
        double actual = convert.convertFrom(0.01, "century", "decade");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testFalsePositive(){
        //purpose: test time converter does not return false positive
        TimeConverter convert = new TimeConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(0.01, "millennium", "second");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
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
