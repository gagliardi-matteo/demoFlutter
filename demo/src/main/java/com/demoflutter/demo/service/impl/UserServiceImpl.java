package com.demoflutter.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoflutter.demo.models.User;
import com.demoflutter.demo.repository.UserDao;
import com.demoflutter.demo.service.UserService;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return this.userDao.getAllUsers();
    }

    @Override
    public User getUserByCode(String code) {
        return this.userDao.getUserByCode(code);
    }

    @Override
    public User inseerUser(User user) {
        this.userDao.insertNewUser(user);
        return user;
    }
    
}
