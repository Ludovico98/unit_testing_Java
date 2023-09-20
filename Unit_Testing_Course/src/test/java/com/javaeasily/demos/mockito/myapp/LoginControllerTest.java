//package com.javaeasily.demos.mockito.myapp.web;
//
//import com.javaeasily.demos.mockito.myapp.mockito.myapp.service.AuthenticationService;
//
//public class LoginControllerTest {
//
//    private AuthenticationService authenticationService;
//    public String service(String username, String password){
//        // send user to: /home
//        // send user to: /login
//
//        return authenticationService.authenticate(username, password) ? "/home":"/login";
//
//    }
//}


package com.javaeasily.demos.mockito.myapp;
import com.javaeasily.demos.mockito.myapp.web.LoginController;
//import junit.framework.TestCase;
import com.javaeasily.demos.mockito.myapp.service.AuthenticationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.mockito.Mockito.*; // using the * imports all the methods inside mockito library

public class LoginControllerTest {
    private LoginController controller; //SUT
    private AuthenticationService service; //mock

    @Before
    public void setUp() throws Exception {
        this.service = mock(AuthenticationService.class);
        this.controller = new LoginController(this.service);
    }

    @Test
    public void testService_validUsernameAndPassword_logInUser() {

        //arrange
        when(service.authenticate(anyString(),anyString())).thenReturn(true);

        //act
        String viewPath = controller.service("tom","password");


        //assert
        Assert.assertNotNull(viewPath);
        Assert.assertEquals("/home",viewPath);

    }
}