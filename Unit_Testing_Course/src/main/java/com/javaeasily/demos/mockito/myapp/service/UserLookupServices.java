package com.javaeasily.demos.mockito.myapp.service;

import com.javaeasily.demos.mockito.myapp.User;
import com.javaeasily.demos.mockito.myapp.data.UserRepository;

import java.util.Set;
import java.util.stream.Collectors;

public class UserLookupServices {

    private UserRepository userRepository;
    public Set<User> getRegularUsers() {
        return getUserByUserType(User.UserType.REGULAR_USER);
    }

    public Set<User> getAdminUsers() {
        return getUserByUserType(User.UserType.ADMIN_USER);
    }

    private Set<User> getUserByUserType(User.UserType userType) {
        return userRepository.findAll()
                .stream()
                .filter(user -> user.isLive() && user.getUserType() == userType)
                .collect(Collectors.toSet());
    }
}
