package com.navr.springweb.helloemployee.config;

import com.navr.springweb.helloemployee.dto.EmployeeDto;
import com.navr.springweb.helloemployee.entity.Employee;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * ModelMapper used to map Entity and DTO objects.
 * <br/>
 * Reference: <br/>
 * <a href="https://modelmapper.org/getting-started/">Getting Started | modelmapper.org</a><br/>
 * <a href="https://modelmapper.org/examples/projection/#example-1">Examples | modelmapper.org</a>
 */
@Configuration
public class HelloEmployeeConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        PropertyMap<Employee, EmployeeDto> employeeMap = new PropertyMap<Employee, EmployeeDto>() {
            protected void configure() {
                map().setStreet(source.getAddress().getStreet());
                map().setCity(source.getAddress().getCity());
            }
        };
        modelMapper.addMappings(employeeMap);
        return modelMapper;
    }

    @Bean
    public ModelMapper entityMapper() {
        ModelMapper entityMapper = new ModelMapper();

        PropertyMap<EmployeeDto, Employee> employeeMap = new PropertyMap<EmployeeDto, Employee>() {
            protected void configure() {
                map().getAddress().setStreet(source.getStreet());
                map().getAddress().setCity(source.getCity());
            }
        };
        entityMapper.addMappings(employeeMap);
        return entityMapper;
    }
}
