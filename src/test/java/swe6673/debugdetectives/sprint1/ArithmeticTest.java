package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Before.*;

public class ArithmeticTest {



    @Test
    public void addPositiveNumbers() throws Exception {
        //Purpose: Test add function with two positive numbers
        Arithmetic num = new Arithmetic();

        //Test 1
        double expected = 8.0;
        double actual = num.add(4.0, 4.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 40.5;
        actual = num.add(22.5, 18);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Negative Test
        expected = 0;
        actual = num.add(-19.0, -19.0);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);

    }

    @Test
    public void addNegativeNumbers() throws Exception {
        //Purpose: Test add function with two negative numbers
        Arithmetic num = new Arithmetic();

        //Test 1
        double expected = -44.0;
        double actual = num.add(8, -52.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 100;
        actual = num.add(16, 84);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Negative Test
        expected = 8.0;
        actual = num.add(-4.0, -4.0);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void addIncorrectNumbers() throws Exception {
        //Purpose: Test add function does not return false positive

        //Test 1
        Arithmetic num = new Arithmetic();
        double expected = 0.0;
        double actual = num.add(20.0, 20.0);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 20.001;
        actual = num.add(8, 12.0);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void subtractPositiveNumbers() throws Exception {
        //Purpose: Test subtract function with two positive numbers
        Arithmetic num = new Arithmetic();

        //Test 1
        double expected = 2.0;
        double actual = num.subtract(6.0, 4.0);

        //Test 2
        expected = 12.0;
        actual = num.subtract(16.0, 4.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Negative Test
        expected = 0.0;
        actual = num.subtract(15, -15.0);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void subtractNegativeNumbers() throws Exception {
        //Purpose: Test subtract function with two negative numbers
        Arithmetic num = new Arithmetic();

        //Test 1
        double expected = 6.0;
        double actual = num.subtract(-4.0, -10.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = -12.0;
        actual = num.subtract(-24.0, -12.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Negative Test
        expected = -100;
        actual = num.subtract(-50, -50);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void subtractIncorrectNumbers() throws Exception {
        //Purpose: Test subtract function does not return a false positive
        Arithmetic num = new Arithmetic();

        //Test 1
        double expected = 0.1;
        double actual = num.subtract(20.0, 20.0);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);


        //Test 2
        expected = 0;
        actual = num.subtract(-10, 10);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }


    @Test
    public void multiplyPositiveNumbers() throws Exception {
        //Purpose: Test multiply function with two positive numbers
        Arithmetic num = new Arithmetic();

        //Test 1
        double expected = 64.0;
        double actual = num.multiply(8.0, 8.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 96.0;
        actual = num.multiply(8, 12.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Negative Test
        expected = 0;
        actual = num.multiply(10, 4);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void multiplyNegativeNumbers() throws Exception {
        //Purpose: Test multiply function with two negative numbers
        Arithmetic num = new Arithmetic();
//Test 1
        double expected = 64.0;
        double actual = num.multiply(-8.0, -8.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = -96.0;
        actual = num.multiply(8, -12.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Negative Test
        expected = 0;
        actual = num.multiply(-10, 4);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
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

        //Test 1
        double expected = 16.0;
        double actual = num.divide(128, 8.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 100;
        actual = num.divide(600, 6);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Negative Test
        expected = 036.0;
        actual = num.divide(6, 6);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void divideNegativeNumbers() throws Exception{
        //Purpose: Test divide function with two negative numbers
        Arithmetic num = new Arithmetic();

        //Test 1
        double expected = -4;
        double actual = num.divide(-16, 4.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Test 2
        expected = 6;
        actual = num.divide(-36, -6);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);

        //Negative Test
        expected = 900;
        actual = num.divide(9000, -10);
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

    @Test
    public void divideIncorrectNumbers() throws Exception{
        //Purpose: Test multiply function does not return false positive

        //Test 1
        Arithmetic num = new Arithmetic();
        double expected = 0.0;
        double actual = num.divide(8.0,2.0);
        assertNotEquals("Error, test results are different than expected", expected, actual,0.0003);

        //Test 2
        expected = 08.0;
        actual = num.divide(-64.0,8.0);
        assertNotEquals("Error, test results are different than expected", expected, actual,0.0003);

    }
}
