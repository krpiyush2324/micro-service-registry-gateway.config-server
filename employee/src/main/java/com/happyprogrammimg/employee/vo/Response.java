package com.happyprogrammimg.employee.vo;

import com.happyprogrammimg.employee.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private Department department;
    private Employee employee;
}
