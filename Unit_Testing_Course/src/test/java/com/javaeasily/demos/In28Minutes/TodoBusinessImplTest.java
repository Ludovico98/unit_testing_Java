package com.javaeasily.demos.In28Minutes;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule()    ;


    @Mock
    TodoService todoServiceMock;
    @InjectMocks
    TodoBusinessImpl todoBusinessImpl;
    @Captor
    ArgumentCaptor<String> stringArgumentCaptor;

    @Test
    public void testDeleteTodosNotRelatedToSpring_usingBDD() {

        //Given
        List<String> todos = Arrays.asList("learn spring MVC", "learning spring", "learn to dance");

        given(todoServiceMock.retriveTodos("Dummy")).willReturn(todos);

        //When
        todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");

        //Then
        verify(todoServiceMock, times(1)).deleteTodo("learn to dance");
        then(todoServiceMock).should().deleteTodo("learn to dance");

        verify(todoServiceMock, atLeast(1)).deleteTodo("learn to dance");
        then(todoServiceMock).should(atLeast(1)).deleteTodo("learn to dance");

        verify(todoServiceMock, never()).deleteTodo("learn spring MVC");
        then(todoServiceMock).should(never()).deleteTodo("learn spring MVC");

        verify(todoServiceMock, never()).deleteTodo("learn spring");
        then(todoServiceMock).should(never()).deleteTodo("learn spring");
    }

//    @Test
//    public void testRetrieveTodosRelatedToSpring_usingBDD() {
//
//        //Given
//        TodoService todoServiceMock = mock(TodoService.class);
//        List<String> todos = Arrays.asList("learn spring `MVC", "learning spring", "learn to dance");
//
//        given(todoServiceMock.retriveTodos("Dummy")).willReturn(todos);
//        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
//
//        //When
//        List<String> filteredTodos = todoBusinessImpl.retriveTodosRelatedToSpring("Dummy");
//
//        //Then
//        assertThat(filteredTodos.size(), is(2) );
//
//    }

}