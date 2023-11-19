package com.in60minutes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private String email;
}
