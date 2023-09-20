package com.javaeasily.demos.mockito.myapp.web;

import com.javaeasily.demos.mockito.myapp.service.AuthenticationService;

public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }

    public String service(String username,String password){
        return authenticationService.authenticate(username, password) ? "/home" : "/login"; //basically a cleaner if statement
    }
}
