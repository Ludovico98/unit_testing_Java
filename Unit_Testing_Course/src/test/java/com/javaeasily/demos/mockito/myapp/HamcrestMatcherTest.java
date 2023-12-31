package com.javaeasily.demos.mockito.myapp;

import org.junit.Test;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class HamcrestMatcherTest {

    @Test
    public void test(){
        List<Integer> scores = Arrays.asList(99, 100, 101, 105);

        //score has 4 items
        assertThat(scores,hasSize(4));
        assertThat(scores,hasItems(99,100));

        //evey item : > 90
        assertThat(scores, everyItem(greaterThan(90)));
        assertThat(scores, everyItem(lessThan(200)));

        //String
        assertThat("", isEmptyString());
        assertThat(null, isEmptyOrNullString());

        //Array
        Integer[] marks = {1, 2, 3 };
        assertThat(marks, arrayWithSize(3));
        assertThat(marks, arrayContaining(1,2,3));
        assertThat(marks, arrayContainingInAnyOrder(2,1,3));

    }
}
