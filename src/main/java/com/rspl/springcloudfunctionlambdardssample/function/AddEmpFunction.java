package com.rspl.springcloudfunctionlambdardssample.function;

import com.rspl.springcloudfunctionlambdardssample.entity.Employee;
import com.rspl.springcloudfunctionlambdardssample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Consumer;

public class AddEmpFunction implements Consumer<Employee> {

    @Autowired
    EmployeeService service;


    @Override
    public void accept(Employee employee) {
        service.addEmployee(employee);
    }
}
