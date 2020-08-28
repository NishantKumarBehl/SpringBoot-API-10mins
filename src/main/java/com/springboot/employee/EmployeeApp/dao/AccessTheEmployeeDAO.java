package com.springboot.employee.EmployeeApp.dao;


import com.springboot.employee.EmployeeApp.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessTheEmployeeDAO extends JpaRepository <EmployeeEntity,Integer>{

}
