package com.demoflutter.demo.service;

import java.util.List;

import com.demoflutter.demo.models.User;

public interface UserService {
    
    public List<User> getAllUsers();

    public User getUserByCode(String code);

    public User inseerUser(User user);

}
