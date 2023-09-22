package com.javaeasily.demos.In28Minutes;

import org.junit.*;
import org.junit.runners.Parameterized;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class StringHelperTest extends Object {
    StringHelper helper;


    @Before
    public void before(){
        helper = new StringHelper();
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Position() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    public void testAreFirstAndLast2CharactersTheSame_Example() {
        assertFalse("This is expecting a false value",true); //Example of failing test
    }

    @Test
    public void testAreFirstAndLast2CharactersTheSame_Negative() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLast2CharactersTheSame_Positive() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

}