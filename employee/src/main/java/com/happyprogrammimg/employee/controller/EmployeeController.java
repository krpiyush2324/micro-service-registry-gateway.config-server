package com.happyprogrammimg.employee.controller;

import com.happyprogrammimg.employee.entity.Employee;
import com.happyprogrammimg.employee.service.EmployeeService;
import com.happyprogrammimg.employee.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        log.info("inside saveEmployee of employee controller");
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Response getEmployeeWithDeparment(@PathVariable ("id") Long employeeId){
        log.info("inside getEmployeeWithDeparment of employee controller");
        return  employeeService.getEmployeeWithDepartment(employeeId);
    }
}
