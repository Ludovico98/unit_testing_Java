package com.javaeasily.demos.mockito.myapp.data;

import com.javaeasily.demos.mockito.myapp.User;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private Map<String, User> users = new HashMap<String, User>();
    public UserRepository(){
        users.put("matt", User.createRegularUser("matt","pass"));
        users.put("ludo", User.createAdminUser("ludo","letmein"));
        users.put("frank", User.createAdminUser("frank","hello"));
        users.put("mark", User.createAdminUser("mark","1234"));
        users.put("pippo", User.createAdminUser("pippo","4321"));
    }
    public User findByUsername(String username) {
        return users.get(username);
    }

    public List<User> findAll(){
        return new LinkedList<>(users.values());
    }
}
