package com.javaeasily.demos.mockito.myapp.web;

import com.javaeasily.demos.mockito.myapp.services.AuthenticaticationService;

public class LoginController {

    private AuthenticaticationService authenticaticationService;
    public String service(String username, String password){
        // send user to: /home
        // send user to: /login

        return authenticaticationService.authenticate(username, password) ? "/home":"/login";

    }
}
