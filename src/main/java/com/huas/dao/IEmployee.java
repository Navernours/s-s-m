package com.huas.dao;

import com.huas.domain.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployee {
    @Select("select * from employee")
    List<Employee> findAll();


    @Insert("insert into employee (emp_id,emp_name,emp_gender,emp_phone,emp_de_id)" +
            " values (#{emp_id},#{emp_name},#{emp_gender},#{emp_phone},#{emp_de_id})")
    void saveEmployee(Employee employee);


    @Delete("delete from employee where emp_id = (#{emp_id}) ")
    void deleteEmployee(Integer emp_id);


    @Update("update employee set emp_name = #{emp_name},emp_gender=#{emp_gender},emp_phone=#{emp_phone}," +
            "emp_de_id=#{emp_de_id} where emp_id = #{emp_id}")
    public void updateEmployee(Employee employee);

}

