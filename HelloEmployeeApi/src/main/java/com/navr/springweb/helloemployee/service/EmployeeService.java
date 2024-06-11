package com.navr.springweb.helloemployee.service;

import com.navr.springweb.helloemployee.data.EmployeeRepository;
import com.navr.springweb.helloemployee.data.EmployeeRepositoryHelper;
import com.navr.springweb.helloemployee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return EmployeeRepositoryHelper.getAllEmployees();
    }

    public Employee getEmployee(long empId) {
        return employeeRepository.getEmployee(empId);
    }

    public boolean addEmployee(Employee employee) {
        return employeeRepository.addEmployee(employee);
    }

}
