package com.apitest.demo.service;

import com.apitest.demo.Repository.EmployeeRepository;
import com.apitest.demo.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public void saveEmployees(List<Employee> employees){
        employeeRepository.saveAll(employees);
    }

    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
