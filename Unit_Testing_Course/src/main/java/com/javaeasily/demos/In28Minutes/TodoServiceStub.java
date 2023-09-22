package com.javaeasily.demos.In28Minutes;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{
    public List<String> retriveTodos(String user) {
        return Arrays.asList("learning spring MVC","learning spring", "learn to dance");
    }
}
