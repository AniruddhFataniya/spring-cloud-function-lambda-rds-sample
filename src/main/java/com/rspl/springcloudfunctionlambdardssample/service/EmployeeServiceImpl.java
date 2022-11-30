package com.rspl.springcloudfunctionlambdardssample.service;

import com.rspl.springcloudfunctionlambdardssample.entity.Employee;
import com.rspl.springcloudfunctionlambdardssample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    Employee employee;

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public List<Employee> listEmployees() {
        return employeeRepository.findAll();
    }

//    @Override
//    public Employee findEmployeeById() {
//        return ;
//    }
}
