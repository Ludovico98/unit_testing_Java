package com.javaeasily.demos.mockito.myapp.service;

import com.javaeasily.demos.mockito.myapp.data.UserRepository;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
public class AuthenticationServiceTest {
    private AuthenticationService service; //SUT
    private UserRepository repository; // mock

    @Before
    public void setUp(){
        this.repository = Mockito.mock(UserRepository.class);
        this.service = new AuthenticationService(this.repository);
    }



    //@Test(expected = NullPointerException.class) // this is going to throw an error because it is expecting (NullPointerException.class) instead it returned (IllegalAccessError)
    @Test(expected = IllegalAccessError.class)

    public void testAuthenticate(){
        //Arrange
        Mockito.when(this.repository.findByUsername(Mockito.anyString())).thenThrow(new IllegalAccessError());
        //act
        this.service.authenticate("harry","Harry12345");
        //assert

    }

}