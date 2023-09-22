package com.javaeasily.demos.In28Minutes;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class TodoBusinessImplTest {
    @Test
    public void retriveTodoRelatedToSpring_usingStub() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(
                todoServiceStub);
        List<String> filteredTodos = todoBusinessImpl.retriveTodosRelatedToSpring("Dummy");

        assertEquals(2,filteredTodos.size());
    }

    @Test
    public void retriveTodoRelatedToSpring_usingStub_empty() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(
                todoServiceStub);
        List<String> filteredTodos = todoBusinessImpl.retriveTodosRelatedToSpring("Dummy");

        assertEquals(0,filteredTodos.size());
    }
}