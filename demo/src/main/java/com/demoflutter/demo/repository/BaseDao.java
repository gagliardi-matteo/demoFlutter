package com.demoflutter.demo.repository;

import jakarta.persistence.EntityManager;

public interface BaseDao {
    
    EntityManager getEntityManager();

}
