package com.eco.service;

import com.eco.entity.Employees;
import com.eco.entity.Jobs;
import com.eco.repository.EmployeeRepository;
import com.eco.response.CurrentEmployeeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CurrentInfoService {

    private final EmployeeRepository employeeRepository;

    public CurrentEmployeeResponse getInfo(Long employeeId) {
        Optional<Employees> employeesOptional = employeeRepository.findById(employeeId);
        Optional<Jobs> jobsOptional =
        return null;
    }
}
