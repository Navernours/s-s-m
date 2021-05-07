package com.huas.controller;

import com.huas.domain.Employee;
import com.huas.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层执行了...");
        List<Employee> list=employeeService.findAllEmployee();
        System.out.println(list);
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/save")
    public void save(Employee account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：保存账户信息");
        employeeService.saveEmployee(account);
        response.sendRedirect(request.getContextPath()+"/employee/findAll");//重定向
        return;
    }


    @RequestMapping("/delete")
    public void delete(Integer emp_id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：根据id删除账户信息");
        employeeService.deleteEmployee(emp_id);
        response.sendRedirect(request.getContextPath()+"/employee/findAll");//重定向
        return;
    }


    @RequestMapping("/update")
    public void update(Employee employee, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：根据id修改账户信息");
        employeeService.updateEmployee(employee);
        response.sendRedirect(request.getContextPath()+"/employee/findAll");//重定向
        return;
    }
}

