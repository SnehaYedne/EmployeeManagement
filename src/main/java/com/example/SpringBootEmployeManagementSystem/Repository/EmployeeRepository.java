package com.example.SpringBootEmployeManagementSystem.Repository;


import com.example.SpringBootEmployeManagementSystem.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepositoryextends JpaRepository<Employee, Integer> {
    Optional<Employee> findEmployeeById(Long id);
}
