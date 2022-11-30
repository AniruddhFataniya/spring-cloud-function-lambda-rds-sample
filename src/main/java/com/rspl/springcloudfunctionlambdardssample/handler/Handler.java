package com.rspl.springcloudfunctionlambdardssample.handler;

import com.rspl.springcloudfunctionlambdardssample.entity.Employee;
import com.rspl.springcloudfunctionlambdardssample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Supplier;

public class Handler extends SpringBootRequestHandler<Employee,Employee> {

}
