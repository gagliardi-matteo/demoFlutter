package com.demoflutter.demo.repository;

import java.util.List;

import com.demoflutter.demo.models.User;

public interface UserDao extends BaseDao{
    
    public List<User> getAllUsers();

    public User getUserByCode(String code);

    public User getById(Long id);

    public void insertNewUser(User user);
    
    public void updateUser(User user);

    public void deleteUser(User user);



}
