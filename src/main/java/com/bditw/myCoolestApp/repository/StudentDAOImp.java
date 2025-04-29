package com.bditw.myCoolestApp.repository;

import com.bditw.myCoolestApp.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Student findById(int id){
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll(){
        TypedQuery<Student> theQuery = entityManager.createQuery("from Student", Student.class);
        return theQuery.getResultList();
    }
    @Override
    public List<Student> findByLastName(String lastName){
        TypedQuery<Student> query = entityManager.createQuery("from Student where lastName=:lastname",Student.class);
        query.setParameter("lastname", lastName);
        return query.getResultList();
    }
}
