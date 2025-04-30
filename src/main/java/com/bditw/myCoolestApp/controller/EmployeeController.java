package com.bditw.myCoolestApp.controller;

import com.bditw.myCoolestApp.model.Employee;
import com.bditw.myCoolestApp.repository.EmployeeDAO;
import com.bditw.myCoolestApp.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }

}
