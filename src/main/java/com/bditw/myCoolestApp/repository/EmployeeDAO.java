package com.bditw.myCoolestApp.repository;

import com.bditw.myCoolestApp.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAllEmployees();
}
