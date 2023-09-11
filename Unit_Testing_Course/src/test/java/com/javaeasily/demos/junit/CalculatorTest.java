package com.javaeasily.demos.junit;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.ValidationException;

//example test
public class CalculatorTest {

    @Test
    public void testAdd(){

        Assert.assertNotNull(new Object());
        Assert.assertTrue(10 == 10);
        Assert.assertNotEquals(1L,2L);
    }


    /*
    a nut test should be divided into 3 sections

    arrange - we start a setup, creating objects that the test might need/data/mocks/mocks objects

    act - one line of code, method that's bring tested

    assert - this is few assertions check the state of the world after they have been executed

     */




//    @Test
//    public void testAdd(){
//        try{
//            //Give bad input to SUT
//            Assert.fail("failing the test");
//        }
//        catch (ValidationException e){
//
//        }
//    }
}
