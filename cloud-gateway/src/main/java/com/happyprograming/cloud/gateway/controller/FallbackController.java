package com.happyprograming.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {


    @GetMapping("/employeeServiceFallback")
    public String employeeServiceFallBackMethod(){
        return "Employee Service is taking longer than expected. Please try again later";
    }


    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallBackMethod(){
        return "Department Service is taking longer than expected. Please try again later";
    }
}
