package com.rspl.springcloudfunctionlambdardssample.function;

import com.rspl.springcloudfunctionlambdardssample.entity.Employee;
import com.rspl.springcloudfunctionlambdardssample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.function.Supplier;

public class ListEmpFunction implements Supplier<List<Employee>> {

    @Autowired
    EmployeeService employeeService;

    @Override
    public List<Employee> get() {
        return employeeService.listEmployees();
    }
}
