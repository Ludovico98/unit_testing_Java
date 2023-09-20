package com.javaeasily.demos.mockito.myapp.data;

import com.javaeasily.demos.mockito.myapp.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String, User> user = new HashMap<String, User>();
    public UserRepository(){
        user.put("matt", new User("matt", "letmein"));
        user.put("frank,", new User("ludo","bitti"));
    }
    public User findByUsername(String username) {
        return user.get(username);

    }
}
