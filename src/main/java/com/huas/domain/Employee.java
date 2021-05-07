package com.huas.domain;

import java.io.Serializable;

public class Employee implements Serializable {
    private Integer emp_id;
    private String emp_name;
    private String emp_gender;
    private String emp_phone;
    private String emp_de_id;
    private Department department;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_gender='" + emp_gender + '\'' +
                ", emp_phone='" + emp_phone + '\'' +
                ", emp_de_id='" + emp_de_id + '\'' +
                ", department=" + department +
                '}';
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_gender() {
        return emp_gender;
    }

    public void setEmp_gender(String emp_gender) {
        this.emp_gender = emp_gender;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    public String getEmp_de_id() {
        return emp_de_id;
    }

    public void setEmp_de_id(String emp_de_id) {
        this.emp_de_id = emp_de_id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee(Integer emp_id, String emp_name, String emp_gender, String emp_phone, String emp_de_id, Department department) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_gender = emp_gender;
        this.emp_phone = emp_phone;
        this.emp_de_id = emp_de_id;
        this.department = department;
    }
}
