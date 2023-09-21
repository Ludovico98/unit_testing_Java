package com.javaeasily.demos.mockito.myapp.service;

import com.javaeasily.demos.mockito.myapp.User;
import com.javaeasily.demos.mockito.myapp.data.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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

        userList.add(User.createRegularUser("marco" , "marco123"));
        userList.add(User.createAdminUser("gianni" , "marco"));

        when(userRepository.findAll()).thenReturn(userList);
        //act

        Set<User> actualUsers = userLookupServices.getRegularUsers();

        //assert - general collections
        assertNotNull(actualUsers);
        assertEquals(actualUsers.size(),1);

//        USED TO CHECK THE NUMBER OF USERS IN THE LIST
//        for (User actualUser:actualUsers){
//            assertNotNull(actualUser);
//            assertEquals(actualUser.getUserType(), User.UserType.REGULAR_USER);
//        }

        //check user 1
        User actualUser1 = userList.get(0);
        assertNotNull(actualUser1);
        assertEquals(actualUser1.getUserType(), User.UserType.REGULAR_USER);
        assertEquals(actualUser1.getUsername(), "marco");
        assertEquals(actualUser1.getPassword(), "marco123");

        //check user 2
        User actualUser2 = userList.get(1);
        assertNotNull(actualUser1);
        assertEquals(actualUser2.getUserType(), User.UserType.ADMIN_USER);
        assertEquals(actualUser2.getUsername(), "gianni");
        assertEquals(actualUser2.getPassword(), "marco");

    }
    @Test
    public void getAdminUsers() {
    }
}