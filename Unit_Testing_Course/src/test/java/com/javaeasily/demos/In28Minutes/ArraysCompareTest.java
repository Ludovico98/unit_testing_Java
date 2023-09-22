package com.javaeasily.demos.In28Minutes;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;


public class ArraysCompareTest {

    @Test
    public void testArraySort_RandomArray() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void testArraySoft_nullArra() {
        int[] numbers = null;
        try {
            Arrays.sort(numbers);
        } catch (NullPointerException e) {

        }
    }

    @Test(expected = NullPointerException.class)
    public void testArraySoft_nullArra_Short() {
        int[] numbers = {};
        Arrays.sort(numbers);
    }

    @Test(timeout = 100) // if the test runs for longer then 100 milliseconds, it will fail
    public void test_Performance() {
        int array[] = {12,23,4};
        for (int i = 1; i <= 100000000; i++){
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
