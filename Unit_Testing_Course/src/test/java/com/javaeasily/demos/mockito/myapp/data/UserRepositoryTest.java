package com.javaeasily.demos.mockito.myapp.data;

import com.javaeasily.demos.mockito.myapp.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryTest {

    private Map<String, User> users = new HashMap<String, User>();


//    public UserRepositoryTest(){
//        users.put("ludo",new User("ludo","letmein"));
//        users.put("matt",new User("matt","pass"));
//    }

    public User findByUsername(String username) {
        return users.get(username);
    }
}
