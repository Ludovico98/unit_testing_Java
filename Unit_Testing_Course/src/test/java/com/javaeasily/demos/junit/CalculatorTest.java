package com.javaeasily.demos.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import  static  org.junit.Assert.*;

import javax.xml.bind.ValidationException;

//example test
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAddPositiveNumbers(){
        // Arrange
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a,b);

        //Assert
        assertEquals(30, result);

    }

    @Test
    public void testAddZeroToPositive(){
        // Arrange
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;

        // Act
        int result = calculator.add(a,b);

        //Assert
        assertEquals(10, result);

    }


    /*
    example code

        Assert.assertNotNull(new Object());
        Assert.assertTrue(10 == 10);
        Assert.assertNotEquals(1L,2L);

     */

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
