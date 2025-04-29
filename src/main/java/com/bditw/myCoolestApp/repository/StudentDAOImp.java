package com.bditw.myCoolestApp.repository;

import com.bditw.myCoolestApp.model.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImp implements StudentDAO {
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public void save(Student student){
        entityManager.persist(student);
    }
}
