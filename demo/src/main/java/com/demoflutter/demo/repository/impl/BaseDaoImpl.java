package com.demoflutter.demo.repository.impl;

import com.demoflutter.demo.repository.BaseDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class BaseDaoImpl  implements BaseDao{

    @PersistenceContext

    protected EntityManager em;

    @Override
    public EntityManager getEntityManager() {
        return em;
    }
    
}
