package com.rspl.springcloudfunctionlambdardssample.repository;

import com.rspl.springcloudfunctionlambdardssample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
