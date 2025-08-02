package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> saveEmployees(List<Employee> employees) {
        if (employees != null && !employees.isEmpty()) {
            return employeeRepository.saveAll(employees);
        } else{
            throw new IllegalArgumentException("Employee list cannot be null or empty");
        }
    }
}