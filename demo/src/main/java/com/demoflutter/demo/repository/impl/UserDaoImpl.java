package com.demoflutter.demo.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demoflutter.demo.models.User;
import com.demoflutter.demo.repository.UserDao;

import jakarta.persistence.EntityManager;

@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao{

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    public List<User> getAllUsers() {
        String query = "SELECT u FROM User u";
        List<User> userList = em.createQuery(query, User.class).getResultList();
        return userList;
    }

    @Override
    public User getUserByCode(String code) {
        String query = "SELECT u FROM User u where code = :code";
        User u = em.createQuery(query, User.class).setParameter("code", code).getSingleResult();
        return u;
    }

    @Override
    public User getById(Long id) {
        User u = em.find(User.class, id);
        return u;
    }

    @Override
    public void insertNewUser(User user) {
        em.persist(user);
    }


    @Override
    public void updateUser(User user) {
        em.merge(user);
    }

    @Override
    public void deleteUser(User user) {
        em.remove(em.contains(user) ? user : em.merge(user));
    }
    
}
