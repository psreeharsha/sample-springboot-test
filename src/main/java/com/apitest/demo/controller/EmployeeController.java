package com.apitest.demo.controller;

import com.apitest.demo.dto.Employee;
import com.apitest.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class EmployeeController {

    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @RequestMapping(path = "/employee", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> getEmployee(){
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @RequestMapping(path = "/employee", method = RequestMethod.POST)
    public ResponseEntity<List<Employee>> postEmployee(@RequestBody Employee request){
        employeeService.saveEmployee(request);
        return getEmployee();
    }
}
