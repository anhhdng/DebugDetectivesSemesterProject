package swe6673.debugdetectives.sprint1;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Before.*;

public class ArithmeticTest {



    @Test
    public void addPositiveNumbers() throws Exception {
        //Purpose: Test add function with two positive numbers
        Arithmetic num = new Arithmetic();
        double expected = 8.0;
        double actual = num.add(4.0, 4.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void addNegativeNumbers() throws Exception {
        //Purpose: Test add function with two negative numbers
        Arithmetic num = new Arithmetic();
        double expected = 8.0;
        double actual = num.add(-4.0, -4.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void addIncorrectNumbers() throws Exception {
        //Purpose: Test add function does not return false positive
        Arithmetic num = new Arithmetic();
        double expected = 0.0;
        double actual = num.add(20.0, 20.0);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void subtractPositiveNumbers() throws Exception {
        //Purpose: Test subtract function with two positive numbers
        Arithmetic num = new Arithmetic();
        double expected = 2.0;
        double actual = num.subtract(6.0, 4.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void subtractNegativeNumbers() throws Exception {
        //Purpose: Test subtract function with two negative numbers
        Arithmetic num = new Arithmetic();
        double expected = 6.0;
        double actual = num.subtract(-4.0, -10.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void subtractIncorrectNumbers() throws Exception {
        //Purpose: Test subtract function does not return a false positive
        Arithmetic num = new Arithmetic();
        double expected = 0.0;
        double actual = num.subtract(20.0, 20.0);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }


    @Test
    public void multiplyPositiveNumbers() throws Exception {
        //Purpose: Test multiply function with two positive numbers
        Arithmetic num = new Arithmetic();
        double expected = 64.0;
        double actual = num.multiply(8.0, 8.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void multiplyNegativeNumbers() throws Exception {
        //Purpose: Test multiply function with two negative numbers
        Arithmetic num = new Arithmetic();
        double expected = 8.0;
        double actual = num.multiply(-4.0, -4.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void multiplyIncorrectNumbers() throws Exception {
        //Purpose: Test multiply function does not return false positive
        Arithmetic num = new Arithmetic();
        double expected = 0.0;
        double actual = num.multiply(20.0, 20.0);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void dividePositiveNumbers() throws Exception{
        //Purpose: Test divide function with two positive numbers
        Arithmetic num = new Arithmetic();
        double expected = 16.0;
        double actual = num.divide(128.0, 8.0 );
        assertEquals("Error, test results are different than expected", expected, actual,0.0003);
    }

    @Test
    public void divideNegativeNumbers() throws Exception{
        //Purpose: Test divide function with two negative numbers
        Arithmetic num = new Arithmetic();
        double expected = 1.0;
        double actual = num.divide(-40.0,-40.0);
        assertEquals("Error, test results are different than expected", expected, actual,0.0003);
    }

    @Test
    public void divideIncorrectNumbers() throws Exception{
        //Purpose: Test multiply function does not return false positive
        Arithmetic num = new Arithmetic();
        double expected = 0.0;
        double actual = num.divide(8.0,2.0);
        assertNotEquals("Error, test results are different than expected", expected, actual,0.0003);
    }
}
