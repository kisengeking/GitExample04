package com.javaguide.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInfoDto {

    private String firstName;
    private String lastName;
    private String department;
  

}
