package com.javaeasily.demos.mockito.myapp.service;

import com.javaeasily.demos.mockito.myapp.User;
import com.javaeasily.demos.mockito.myapp.data.UserRepository;
import org.hamcrest.Matchers;
import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.*;
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
        userList.add(User.createRegularUser("marco" , "marco123"));
        userList.add(User.createRegularUser("polo" , "polo123"));
        userList.add(User.createAdminUser("gianni" , "password"));

        when(userRepository.findAll()).thenReturn(userList);

        //act
        Set<User> actualUsers = userLookupServices.getRegularUsers();

        //assert - general collections
        assertThat(actualUsers, is(notNullValue()));
        assertThat(actualUsers.size(), equalTo(2));

        assertThat(actualUsers, containsInAnyOrder(
                allOf(
                        Matchers.hasProperty("username", equalTo("marco")),
                        Matchers.hasProperty("password", equalTo("marco123"))
                ),
                allOf(
                        Matchers.hasProperty("username", equalTo("polo")),
                        Matchers.hasProperty("password", equalTo("polo123"))
                        // THIS ENABLED TO DO MORE FINE GRAINING TESTING
                )

                //equalTo(User.createRegularUser("polo","polo123")) THIS IS A DIFFERENT WAY TO CHECK FOR THE RESULT
        ));

          // USED TO CHECK THE NUMBER OF USERS IN THE LIST
//
//        for (User actualUser:actualUsers){
//            assertNotNull(actualUser);
//            assertEquals(actualUser.getUserType(), User.UserType.REGULAR_USER);
//        }


          // USED TO CHECK IF THE NAME AND PASSWORD MATCH THE USER IN THE POSITION LIST

//        //check user 1
//        User actualUser1 = userList.get(0);
//        assertNotNull(actualUser1);
//        assertEquals(actualUser1.getUserType(), User.UserType.REGULAR_USER);
//        assertEquals(actualUser1.getUsername(), "marco");
//        assertEquals(actualUser1.getPassword(), "marco123");
//
//        //check user 2
//        User actualUser2 = userList.get(1);
//        assertNotNull(actualUser1);
//        assertEquals(actualUser2.getUserType(), User.UserType.ADMIN_USER);
//        assertEquals(actualUser2.getUsername(), "gianni");
//        assertEquals(actualUser2.getPassword(), "marco");

    }
    @Test
    public void getAdminUsers() {
    }
}