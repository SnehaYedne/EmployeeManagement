
import com.example.SpringBootEmployeManagementSystem.Entity.Employee;
import com.example.SpringBootEmployeManagementSystem.Exception.EmployeeNotFoundException;
import com.example.SpringBootEmployeManagementSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
package com.example.SpringBootEmployeManagementSystem.Service;
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee addEmployee(Employee employee) {

        return  employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepository.findEmployeeById(id).
                orElseThrow(()->new EmployeeNotFoundException("Employee by id "+id+ "was not found"));
    }



    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        Employee existingEmployee = this.employeeRepository.findEmployeeById(id).
                orElseThrow(()->new EmployeeNotFoundException("Employee by id "+id+ "was not found"));
        this.employeeRepository.delete(existingEmployee);
    }
}
