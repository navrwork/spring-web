package com.navr.springweb.helloemployee.data;

import com.navr.springweb.helloemployee.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    public List<Employee> getAllEmployees() {
        return EmployeeRepositoryHelper.getAllEmployees();
    }

    public Employee getEmployee(long empId) {
        return EmployeeRepositoryHelper.getEmployee(empId);
    }

    public boolean addEmployee(Employee employee) {
        return EmployeeRepositoryHelper.addEmployee(employee);
    }

}
