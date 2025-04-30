package com.bditw.myCoolestApp.controller;

import com.bditw.myCoolestApp.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @PostConstruct
    public void loadData() {}
    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("John", "Smith", 18));
        employees.add(new Employee("Jane", "Doe", 17));
        return employees;

    }

}
