package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnergyConverterTest {
    @Test
    public void convertJoulesToCalories(){
        //purpose: test joules to calories with long decimal value output
        EnergyConverter convert = new EnergyConverter();
        double expected = 0.0023900573613767;
        double actual = convert.convertFrom(10.0, "joules", "calories");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertCaloriesToKilocalories(){
        //purpose: test joules to calories with long decimal value output
        EnergyConverter convert = new EnergyConverter();
        double expected = 0.00001;
        double actual = convert.convertFrom(0.01, "calories", "kilocalories");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMegajoulesToMillijoules(){
        //purpose: test megajoules to millijoules with large output
        EnergyConverter convert = new EnergyConverter();
        double expected = 1000000000;
        double actual = convert.convertFrom(1.0, "megajoules", "millijoules");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertHorsepowerToWattHour(){
        //purpose: test horsepower to watt-hour
        EnergyConverter convert = new EnergyConverter();
        double expected = 7281.437625;
        double actual = convert.convertFrom(9.9, "horsepower", "watt-hour");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertElectronVoltToKiloelectronVolt(){
        //purpose: test horsepower to watt-hour with boundary value just above zero
        EnergyConverter convert = new EnergyConverter();
        double expected = 0.00001;
        double actual = convert.convertFrom(0.01, "electron-volt", "kiloelectron-volt");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testZeroValue(){
        //purpose: test energy converter with zero value
        EnergyConverter convert = new EnergyConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(0.0, "joules", "watt-hours");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testMaximumValue(){
        //purpose: test energy converter with maximum integer value
        EnergyConverter convert = new EnergyConverter();
        double expected = 2147483.647 ;
        double actual = convert.convertFrom(2147483647 , "joules", "kilojoules");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testNegativeValue(){
        //purpose: test energy converter with negative value
        EnergyConverter convert = new EnergyConverter();
        double expected = -1 ;
        double actual = convert.convertFrom(-1000 , "joules", "kilojoules");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testBoundary(){
        //purpose: test energy converter with boundary value of 1023
        EnergyConverter convert = new EnergyConverter();
        double expected = 1.023 ;
        double actual = convert.convertFrom(1023 , "joules", "kilojoules");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
}
