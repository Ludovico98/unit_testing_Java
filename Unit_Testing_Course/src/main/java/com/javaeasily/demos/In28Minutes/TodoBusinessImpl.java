package com.javaeasily.demos.In28Minutes;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    public List<String> retriveTodosRelatedToSpring(String user){
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = todoService.retriveTodos(user);
        for (String todo:todos){
            if (todo.contains("spring")){
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
