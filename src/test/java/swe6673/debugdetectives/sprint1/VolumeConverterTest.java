package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VolumeConverterTest {
    @Test
    public void convertUSGallonToImperialGallon(){
        //purpose: test US gallon to Imperial gallon
        VolumeConverter convert = new VolumeConverter();

        //Test 1
        double expected = 83.2674;
        double actual = convert.convertFrom(100.0, "USGallon", "ImperialGallon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 0.00083267418;
        actual = convert.convertFrom(0.001, "USGallon", "ImperialGallon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 3
        expected = 8.24347;
        actual = convert.convertFrom(9.9, "USGallon", "ImperialGallon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0.0;
        actual = convert.convertFrom(9.9, "USGallon", "ImperialGallon");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertUSGallonToUSQuart(){
        //purpose: test US gallon to US quart with boundary point of 1.0
        VolumeConverter convert = new VolumeConverter();

        //Test 1
        double expected = 4.0;
        double actual = convert.convertFrom(1.0, "USGallon", "USQuart");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 399.996;
        actual = convert.convertFrom(99.999, "USGallon", "USQuart");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0;
        actual = convert.convertFrom(12333, "USGallon", "USQuart");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertUSTablespoonToImperialCup(){
        //purpose: test US tablespoon to Imperial Cup with boundary point of value just above zero
        VolumeConverter convert = new VolumeConverter();

        //Test 1
        double expected = 0.0005204214;
        double actual = convert.convertFrom(0.01, "USTablespoon", "ImperialCup");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 5.20416207;
        actual = convert.convertFrom(99.999, "USTablespoon", "ImperialCup");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 3
        expected = 5.251052;
        actual = convert.convertFrom(100.9, "USTablespoon", "ImperialCup");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0;
        actual = convert.convertFrom(100.9, "USTablespoon", "ImperialCup");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertLiterToImperialOunce(){
        //purpose: test US liter to Imperial Cup with boundary point of 99.9
        VolumeConverter convert = new VolumeConverter();

        //Test 1
        double expected = 3515.983824362706;
        double actual = convert.convertFrom(99.9, "Liter", "ImperialOunce");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 35.1951;
        actual = convert.convertFrom(1, "Liter", "ImperialOunce");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 3
        expected = 00.1;
        actual = convert.convertFrom(0.002841306, "Liter", "ImperialOunce");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0.0;
        actual = convert.convertFrom(0.002841306, "Liter", "ImperialOunce");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMilliliterToUSTeaspoon(){
        //purpose: test milliliter to US teaspoon
        VolumeConverter convert = new VolumeConverter();

        //Test 1
        double expected = 0.318081852;
        double actual = convert.convertFrom(1.5678, "Milliliter", "USTeaspoon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 0.202884;
        actual = convert.convertFrom(1, "Milliliter", "USTeaspoon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 3
        expected = 0.01;
        actual = convert.convertFrom(0.0492892, "Milliliter", "USTeaspoon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0;
        actual = convert.convertFrom(0.0492892, "Milliliter", "USTeaspoon");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertUSPintToImperialPint(){
        //purpose: test US pint to imperial pint --same unit in two systems
        VolumeConverter convert = new VolumeConverter();

        //Test 1
        double expected = 8.32674;
        double actual = convert.convertFrom(10.0, "USPint", "ImperialPint");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 1.000000062;
        actual = convert.convertFrom(1.20095, "USPint", "ImperialPint");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0;
        actual = convert.convertFrom(9999, "USPint", "ImperialPint");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);

    }
    @Test
    public void convertUSTablespoonToUSTeaspoon(){
        //purpose: test US tablespoon to US teaspoon --two units in same system
        VolumeConverter convert = new VolumeConverter();

        //Test 1
        double expected = 36.60001;
        double actual = convert.convertFrom(12.20, "USTablespoon", "USTeaspoon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 0.003000001;
        actual = convert.convertFrom(0.001, "USTablespoon", "USTeaspoon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 3
        expected = 99.99;
        actual = convert.convertFrom(33.329989, "USTablespoon", "USTeaspoon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0;
        actual = convert.convertFrom(33.329989, "USTablespoon", "USTeaspoon");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertCubicFootToCubicInch(){
        //purpose: test cubic foot to cubic inch with boundary point of 100.01
        VolumeConverter convert = new VolumeConverter();

        //Test 1
        double expected = 172817.117162;
        double actual = convert.convertFrom(100.01, "CubicFoot", "CubicInch");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 100.9;
        actual = convert.convertFrom(0.058391204, "CubicFoot", "CubicInch");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 3
        expected = 1.728;
        actual = convert.convertFrom(0.001, "CubicFoot", "CubicInch");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //False Positive Test
        expected = 0;
        actual = convert.convertFrom(0.001, "CubicFoot", "CubicInch");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSameUnit(){
        //purpose: test conversion with same unit and boundary point of value  just below zero
        VolumeConverter convert = new VolumeConverter();
        double expected = -0.01;
        double actual = convert.convertFrom(-0.01, "ImperialOunce", "ImperialOunce");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testFalsePositive(){
        //purpose: test volume converter does not return false positive
        VolumeConverter convert = new VolumeConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(10, "Liter", "ImperialOunce");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testNegativeInput(){
        //purpose: test volume converter with negative input
        VolumeConverter convert = new VolumeConverter();
        double expected = -45460.9;
        double actual = convert.convertFrom(-10.0, "ImperialGallon", "Milliliter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

}
