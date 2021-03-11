package com.happyprogrammimg.deparment.controller;

import com.happyprogrammimg.deparment.entity.Department;
import com.happyprogrammimg.deparment.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/add")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside SaveDepartment method in controller ");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Optional<Department> findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside findDepartmentById method in controller ");
        return departmentService.findDepartmentById(departmentId);
    }
}
