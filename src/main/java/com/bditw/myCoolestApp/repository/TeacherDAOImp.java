package com.bditw.myCoolestApp.repository;

import com.bditw.myCoolestApp.model.Teacher;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TeacherDAOImp implements TeacherDAO {

    private EntityManager entityManager;

    @Autowired
    public TeacherDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Teacher teacher) {
        entityManager.persist(teacher);
    }
}
