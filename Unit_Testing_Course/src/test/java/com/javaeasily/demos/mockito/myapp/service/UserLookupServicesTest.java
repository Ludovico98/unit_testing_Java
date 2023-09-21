package com.javaeasily.demos.mockito.myapp.service;

import com.javaeasily.demos.mockito.myapp.User;
import com.javaeasily.demos.mockito.myapp.data.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserLookupServicesTest {

    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserLookupServices userLookupServices;
    @Test
    public void getRegularUsers() {

        //arrange
        List<User> userList = new LinkedList<>();
        System.out.println("I have added something!!!");

        userList.add(User.createRegularUser("marco" , "marco"));
        userList.add(User.createAdminUser("gianni" , "marco"));

        when(userRepository.findAll()).thenReturn(userList);
        //act

        Set<User> actualUsers = userLookupServices.getRegularUsers();

        //assert
    }
    @Test
    public void getAdminUsers() {
    }
}