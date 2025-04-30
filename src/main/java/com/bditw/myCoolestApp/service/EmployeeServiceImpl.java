package com.bditw.myCoolestApp.service;

import com.bditw.myCoolestApp.model.Employee;
import com.bditw.myCoolestApp.repository.EmployeeDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {
    private EmployeeDAO employeeDAO;
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    public List<Employee> findAllEmployees() {
        return employeeDAO.findAllEmployees();
    }
}
