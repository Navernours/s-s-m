package com.huas.service;

import com.huas.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployee();

    void saveEmployee(Employee employee);

    void deleteEmployee(Integer emp_id);

    void updateEmployee(Employee employee);
}
