package com.rspl.springcloudfunctionlambdardssample.service;

import com.rspl.springcloudfunctionlambdardssample.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;
//@Service
public interface EmployeeService {
    public void addEmployee(Employee employee);
    public List<Employee> listEmployees();
    //public Employee findEmployeeById();

}
