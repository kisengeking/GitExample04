package com.javaguide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaguide.model.EmployeeInfoDto;
import com.javaguide.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeInfoDto> getAllEmployeeInfo() {
        return employeeRepository.findAllEmployeeInfo();
    }
}
