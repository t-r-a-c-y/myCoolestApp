package com.bditw.myCoolestApp.repository;

import com.bditw.myCoolestApp.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAllEmployees() {
        TypedQuery<Employee> Query = entityManager.createQuery("from Employee ",Employee.class);
        List<Employee> employees = Query.getResultList();
        return employees;
    }

    @Override
    public Employee findEmployeeById(int id) {
        Employee emp = entityManager.find(Employee.class,id);
        return emp;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        Employee emp = findEmployeeById(id);
        entityManager.remove(emp);

    }
}
