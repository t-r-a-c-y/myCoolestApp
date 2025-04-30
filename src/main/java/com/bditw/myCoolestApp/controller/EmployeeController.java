package com.bditw.myCoolestApp.controller;

import com.bditw.myCoolestApp.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    List<Employee> employees = new ArrayList<>();
    @PostConstruct
    public void loadData() {
        employees.add(new Employee("John", "Smith", 18));
        employees.add(new Employee("Jane", "Doe", 17));
    }
    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        return employees;

    }
    @GetMapping("/employee/{employeeid}")
    public Employee getEmployee(@PathVariable int employeeid) {
        return employees.get(employeeid);
    }

}
