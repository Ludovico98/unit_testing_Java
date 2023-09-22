package com.javaeasily.demos.In28Minutes;

import org.junit.*;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("BEFORE CLASS");
    }

    @Before
    public void setup(){
        System.out.println("This is the BEFORE message !!!");
    }

    @Test
    public void test1(){
        System.out.println("test 1 executed");
    }

    @Test
    public void test2(){
        System.out.println("test 2 executed");
    }

    @Test
    public void test3(){
        System.out.println("test 3 executed");
    }

    @After
    public void teardown(){
        System.out.println("This is the AFTER message !!!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("AFTER CLASS");
    }

}
