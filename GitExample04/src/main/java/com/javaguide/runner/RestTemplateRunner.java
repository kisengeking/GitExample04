package com.javaguide.runner;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.javaguide.model.EmployeeInfoDto;
import com.javaguide.service.EmployeeService;


@Component
public class RestTemplateRunner implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(RestTemplateRunner.class);
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	EmployeeService employeeService;
	
	@Override
	public void run(String... args) throws Exception {
		
		 List<EmployeeInfoDto> employeeInfo = employeeService.getAllEmployeeInfo();
	        for (EmployeeInfoDto info : employeeInfo) {
	            System.out.println(info.getFirstName());
	            System.out.println(info.getLastName());
	            System.out.println(info.getDepartment());
	        }

	}
	

	
}