package com.example.springboot.service;

import com.example.springboot.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    void updateEmployee(Employee employee);
    Employee findById(Long id);
    void deleteEmployee(Long employee);
}
