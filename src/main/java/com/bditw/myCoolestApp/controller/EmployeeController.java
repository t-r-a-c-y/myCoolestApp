package com.bditw.myCoolestApp.controller;

import com.bditw.myCoolestApp.model.Employee;
import com.bditw.myCoolestApp.repository.EmployeeDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private EmployeeDAO employeeDAO;
    public EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeDAO.findAllEmployees();
    }

}
