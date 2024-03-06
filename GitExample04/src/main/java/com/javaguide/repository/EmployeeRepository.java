package com.javaguide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javaguide.model.Employee;
import com.javaguide.model.EmployeeInfoDto;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT new com.bezkoder.spring.jpa.oracle.model.EmployeeInfoDto(e.firstName, e.lastName, e.department) FROM Employee e")
    List<EmployeeInfoDto> findAllEmployeeInfo();
}
