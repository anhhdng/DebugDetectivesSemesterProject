package swe6673.debugdetectives.sprint1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Before.*;

public class ControllerTest {

    @Test
    public void checkNumberLengthFalse(){
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded
        boolean actual = numberLength.checkNumberLength(10000000000.0); //10,000,000,000 eleven digits
        boolean expected = false;
        assertEquals("Error, test results are different than expected", expected, actual);
    }
    @Test
    public void checkNumberLengthTrue(){
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded
        boolean actual = numberLength.checkNumberLength(100000000.0); //10,000,000,000 eleven digits
        boolean expected = true;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void checkDecimalLengthFalse(){
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded
        boolean actual = numberLength.checkNumberLength(0.0000000008); // ten decimals and one whole number
        boolean expected = false;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void checkDecimalLengthTrue(){
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded
        boolean actual = numberLength.checkNumberLength(9.000000008); // ten decimals and one whole number
        boolean expected = true;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

}
