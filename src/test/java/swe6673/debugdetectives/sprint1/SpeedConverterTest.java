package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Formatter;

import static org.junit.Assert.assertEquals;

public class SpeedConverterTest {
    @Test
    public void convertKmHToMS(){
        //purpose:test km/h to m/s with boundary value of 100.01
        SpeedConverter convert = new SpeedConverter();
        double expected = 27.780555556;
        double actual = convert.convertFrom(100.01, "km/h", "m/s");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMiHToKmMin(){
        //purpose:test mi/h to km/min
        SpeedConverter convert = new SpeedConverter();
        double expected = 1.609344;
        double actual = convert.convertFrom(60, "mi/h", "km/min");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMileHourToMeterHour(){
        //purpose:test mi/h to m/h with boundary value of 0.01
        SpeedConverter convert = new SpeedConverter();
        double expected = 16.09344;
        double actual = convert.convertFrom(0.01, "mi/h", "m/h");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testMaximumValue(){
        //purpose:test cm/min to ft/h with maximum integer value in Java: 2147483647
        SpeedConverter convert = new SpeedConverter();
        double expected = 4227330020.2;
        double value = 2147483647;
        double actual = convert.convertFrom(value, "cm/min", "ft/h");
        Formatter fmt = new Formatter();
        fmt = fmt.format("%.1f", actual);
        System.out.println(fmt);
        assertEquals("Error, test results are different than expected", expected, Double.valueOf(String.valueOf(fmt)), 0.0003);
    }
    @Test
    public void testMinimumValue(){
        //purpose:test cm/min to ft/h with minimum integer value of -2147483647
        SpeedConverter convert = new SpeedConverter();
        double expected = -4227330020.2;
        double actual = convert.convertFrom(-2147483647, "cm/min", "ft/h");
        Formatter fmt = new Formatter();
        fmt = fmt.format("%.1f", actual);
        assertEquals("Error, test results are different than expected",expected, Double.valueOf(String.valueOf(fmt)), 0.0003);
    }
    @Test
    public void testZeroValue(){
        //purpose:test yd/h to cm/h with zero value
        SpeedConverter convert = new SpeedConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(0.0, "yd/h", "cm/h");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testFalsePositive(){
        //purpose:test mi/s to ft/min with zero value
        SpeedConverter convert = new SpeedConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(9.9, "mi/s", "ft/min");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }


}
