package com.eco.response;

import com.eco.entity.Locations;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CurrentEmployeeResponse {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNember;
    private LocalDate hireDate;
    private String jobTitle;
    private String salary;
    private Double commissionPct;
    private Long managerId;
    private String departmentName;
}
