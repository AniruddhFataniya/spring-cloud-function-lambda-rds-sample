package com.rspl.springcloudfunctionlambdardssample;

import com.rspl.springcloudfunctionlambdardssample.entity.Employee;
import com.rspl.springcloudfunctionlambdardssample.function.AddEmpFunction;
import com.rspl.springcloudfunctionlambdardssample.function.ListEmpFunction;
import com.rspl.springcloudfunctionlambdardssample.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudFunctionLambdaRdsSampleApplication {

	@Autowired
	EmployeeService employeeService;

//	@Bean
//	public Supplier<List<Employee>> employeeList(){
//		return ()-> employeeService.listEmployees();
////		return ()-> repository.findAll();
//	}

	@Bean
	ListEmpFunction listEmpBean(){
		return new ListEmpFunction();
	}

	@Bean
	AddEmpFunction addEmpBean(){
		return new AddEmpFunction();
	}



//	@Bean
//	public Consumer<Employee> addEmployee(Employee employee){
//		return employeeService.addEmployee(employee);
////		return (Consumer<Employee>) repository.save(employee);
//	}


	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionLambdaRdsSampleApplication.class, args);
	}

}
