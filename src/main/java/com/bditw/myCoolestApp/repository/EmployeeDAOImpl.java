package com.bditw.myCoolestApp.repository;

import com.bditw.myCoolestApp.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAllEmployees() {
        TypedQuery<Employee> Query = entityManager.createQuery("from Employee ",Employee.class);
        List<Employee> employees = Query.getResultList();
        return employees;
    }
}
