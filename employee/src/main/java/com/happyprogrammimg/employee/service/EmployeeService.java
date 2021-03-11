package com.happyprogrammimg.employee.service;

import com.happyprogrammimg.employee.entity.Employee;
import com.happyprogrammimg.employee.repository.EmployeeRepository;
import com.happyprogrammimg.employee.vo.Department;
import com.happyprogrammimg.employee.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@Slf4j
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    RestTemplate restTemplate;

    public Employee saveEmployee(Employee employee) {
        log.info("inside saveEmployee of employee service");
        return employeeRepository.save(employee);
    }


    public Response getEmployeeWithDepartment(Long employeeId) {
        Response response = new Response();
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" + employee.get().getDepartmentId(), Department.class);
        response.setDepartment(department);
        response.setEmployee(employee.get());
        return response;
    }
}
