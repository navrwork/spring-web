package com.navr.springweb.helloemployee.controller;

import com.navr.springweb.helloemployee.dto.EmployeeDto;
import com.navr.springweb.helloemployee.dto.GenericResponse;
import com.navr.springweb.helloemployee.entity.Employee;
import com.navr.springweb.helloemployee.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(
        value = "/employeeapp/api",
        produces = {MediaType.APPLICATION_JSON_VALUE}
)
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ModelMapper entityMapper;

    @GetMapping(value = "/employees")
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        return convertToDto(employeeList);
    }

    @GetMapping(value = "/employees/{empId}")
    public EmployeeDto getEmployee(@PathVariable long empId) {
        Employee employee = employeeService.getEmployee(empId);
        EmployeeDto employeeDto = employee != null ? convertToDto(employee) : null;
        return employeeDto;
    }

    @PostMapping(value = "/employees",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public GenericResponse addEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee employee = convertToEntity(employeeDto);
        boolean isSuccess = employeeService.addEmployee(employee);
        GenericResponse genericResponse = new GenericResponse(isSuccess, "Employee successfully added!");
        return genericResponse;
    }

    private List<EmployeeDto> convertToDto(List<Employee> employeeList) {
        return employeeList.stream().map(e -> modelMapper.map(e, EmployeeDto.class)).collect(Collectors.toList());
    }

    private EmployeeDto convertToDto(Employee employee) {
        return modelMapper.map(employee, EmployeeDto.class);
    }

    private Employee convertToEntity(EmployeeDto employeeDto) {
        return entityMapper.map(employeeDto, Employee.class);
    }
}
