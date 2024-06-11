package com.navr.springweb.helloemployee.data;

import com.navr.springweb.helloemployee.entity.Employee;
import com.navr.springweb.helloemployee.entity.EmployeeAddress;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryHelper {

    private static List<Employee> employeeList;

    static {
        initEmployeeData();
    }

    private static void initEmployeeData() {
        Employee e1 = new Employee(100L, "aaa", "AAA", LocalDate.of(2010, 1, 1));
        EmployeeAddress ea1 = new EmployeeAddress("100, Pantheon road, Egmore", "Chennai");
        e1.setAddress(ea1);

        Employee e2 = new Employee(200L, "nnn", "NNN", LocalDate.of(2020, 2, 2));
        EmployeeAddress ea2 = new EmployeeAddress("200, Race course road, Guindy", "Chennai");
        e2.setAddress(ea2);

        employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
    }

    public static List<Employee> getAllEmployees() {
        return employeeList;
    }

    public static Employee getEmployee(long empId) {
        Employee emp = null;
        if (employeeList != null && !employeeList.isEmpty()) {
            emp = employeeList.stream().filter(e -> e.getId() == empId).findFirst().orElse(null);
        }
        return emp;
    }

    public static boolean addEmployee(Employee employee) {
        return employeeList.add(employee);
    }
}
