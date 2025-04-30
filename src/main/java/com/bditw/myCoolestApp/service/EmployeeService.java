package com.bditw.myCoolestApp.service;

import com.bditw.myCoolestApp.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployees();
    Employee findEmployeeById(int id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(int id);
}
