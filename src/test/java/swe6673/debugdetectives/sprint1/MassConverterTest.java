package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MassConverterTest {
    @Test
    public void convertMetricTonToPound(){
        //purpose: test metric ton to pound with boundary value of 0.01
        MassConverter convert = new MassConverter();
        double expected = 22.04623;
        double actual = convert.convertFrom(0.01, "metricTon", "pound");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertStoneToGram(){
        //purpose: test stone to gram with small decimal value
        MassConverter convert = new MassConverter();
        double expected = 0.635029318;
        double actual = convert.convertFrom(0.0001, "stone", "gram");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMilligramToMicrogram(){
        //purpose: test miligram to microgram with boundary value of 999.9
        MassConverter convert = new MassConverter();
        double expected = 999900;
        double actual = convert.convertFrom(999.9, "milligram", "microgram");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertImperialTonToUSTon(){
        //purpose: test imperial ton to US ton
        MassConverter convert = new MassConverter();
        double expected = 1120.0;
        double actual = convert.convertFrom(1000.0, "imperialTon", "USTon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testZeroInput(){
        //purpose: test mass converter with zero input
        MassConverter convert = new MassConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(0.0, "pound", "gram");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testMaxiumValue(){
        //purpose: test mass converter with maximum integer value
        MassConverter convert = new MassConverter();
        double expected = 2147483.647;
        double actual = convert.convertFrom(2147483647, "gram", "kilogram");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testNegativeValue(){
        //purpose: test mass converter with negative value
        MassConverter convert = new MassConverter();
        double expected = -110.22011;
        double actual = convert.convertFrom(-99.99, "metricTon", "USTon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testFalsePostive(){
        //purpose: test mass converter does not return false positive
        MassConverter convert = new MassConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(199.01, "microgram", "USTon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
}
