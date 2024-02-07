package com.eco.controller;

import com.eco.request.CurrentEmployeeRequest;
import com.eco.response.CurrentEmployeeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/current")
public class CurrentInfoController {


    @GetMapping()
    public ResponseEntity<CurrentEmployeeRequest> currentInfoAboutEmployee() {
        CurrentEmployeeResponse currentEmployeeResponse =
        return ResponseEntity.ok();
    }
}
