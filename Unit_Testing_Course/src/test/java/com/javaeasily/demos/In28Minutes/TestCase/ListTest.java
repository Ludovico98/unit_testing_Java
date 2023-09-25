package com.javaeasily.demos.In28Minutes.TestCase;


import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;

import com.javaeasily.demos.In28Minutes.TodoService;
import org.junit.Test;

public class ListTest {

    @Test
    public void mockListSizeMethod(){

        List listMock = mock(List.class);
        when (listMock.size()).thenReturn(2);

        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
    }

    @Test
    public void mockListSizeMethod_MultipleValues(){

        List listMock = mock(List.class);
        when (listMock.get(0)).thenReturn("hello there");

        assertEquals("hello there",listMock.get(0));
    }

    @Test
    public void mockListSizeMethod_AnyValue(){

        List listMock = mock(List.class);
        when (listMock.get(anyInt())).thenReturn("hello there");

        assertEquals("hello there",listMock.get(0));
        assertEquals("hello there",listMock.get(1));
    }

    @Test
    public void mockListGet_UsingBDD(){
        //Given
        List<String> listMock = mock(List.class);
        given(listMock.get(anyInt())).willReturn("Hi I am returning a value");

        //When
        String firstElement = listMock.get(0);

        //Then
        assertThat(firstElement, is("Hi I am returning a value"));
    }


    @Test(expected = RuntimeException.class)
    public void mockListSizeMethod_Exception(){

        List listMock = mock(List.class);
        when (listMock.get(anyInt())).thenThrow( new RuntimeException("Some exception"));

        listMock.get(0);
    }

    @Test(expected = RuntimeException.class)
    public void mockListSizeMethod_mixingUp(){
        List listMock = mock(List.class);

        when (listMock.subList(anyInt(),5)).thenThrow( new RuntimeException("Some exception"));

        listMock.get(0);
    }

}