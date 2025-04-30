package com.bditw.myCoolestApp.repository;

import com.bditw.myCoolestApp.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAllEmployees();
    Employee findEmployeeById(int id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(int id);
}
