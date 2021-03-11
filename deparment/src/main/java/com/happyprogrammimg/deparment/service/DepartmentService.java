package com.happyprogrammimg.deparment.service;

import com.happyprogrammimg.deparment.entity.Department;
import com.happyprogrammimg.deparment.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment method in service");
        return departmentRepository.save(department);
    }

    public Optional<Department> findDepartmentById(Long departmentId) {
        log.info("inside saveDepartment method in findDepartmentById");
        return departmentRepository.findById(departmentId);
    }
}
