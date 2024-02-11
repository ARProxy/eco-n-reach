package com.eco.controller;

import com.eco.request.CurrentEmployeeRequest;
import com.eco.response.CurrentEmployeeResponse;
import com.eco.service.CurrentInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/current")
public class CurrentInfoController {

    private final CurrentInfoService currentInfoService;

    @GetMapping()
    public ResponseEntity<CurrentEmployeeResponse> currentInfoAboutEmployee(Long employeeId) {
        CurrentEmployeeResponse currentEmployeeResponse = currentInfoService.getInfo(employeeId);
        return ResponseEntity.ok(currentEmployeeResponse);
    }
}
