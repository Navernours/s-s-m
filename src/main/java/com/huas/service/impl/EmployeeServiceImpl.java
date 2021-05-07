package com.huas.service.impl;

import com.huas.dao.IEmployee;
import com.huas.domain.Employee;
import com.huas.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private IEmployee iEmployee;

    public List<Employee> findAllEmployee() {
        System.out.println("业务层:查询所有账户");
        return iEmployee.findAll();
    }


    public void saveEmployee(Employee employee) {
        System.out.println("业务层：保存账户信息");
        iEmployee.saveEmployee(employee);
    }

    public void deleteEmployee(Integer emp_id) {
        System.out.println("业务层：根据id删除账户信息");
        iEmployee.deleteEmployee(emp_id);
    }

    public void updateEmployee(Employee employee) {
        System.out.println("业务层：根据id修改账户信息");
        iEmployee.updateEmployee(employee);
    }

}
