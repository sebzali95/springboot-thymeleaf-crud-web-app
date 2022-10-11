package com.example.springboottymeleafcrudwebapp.service;

import com.example.springboottymeleafcrudwebapp.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
