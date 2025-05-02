package com.bditw.myCoolestApp.controller;

import com.bditw.myCoolestApp.model.Employee;
import com.bditw.myCoolestApp.repository.EmployeeDAO;
import com.bditw.myCoolestApp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/employees/{employeesId}")
    public Employee findEmployeeById(@PathVariable int employeesId) {
        return employeeService.findEmployeeById(employeesId);
    }

   @PostMapping("/employees")
   public Employee saveEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        return employeeService.saveEmployee(employee);
   }

    @DeleteMapping("/employees/{employeesId}")
    public void deleteEmployee(@PathVariable int employeesId) {
        employeeService.deleteEmployee(employeesId);
    }


    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }


}
