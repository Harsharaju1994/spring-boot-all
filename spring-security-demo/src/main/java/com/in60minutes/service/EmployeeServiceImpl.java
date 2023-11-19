package com.in60minutes.service;

import com.in60minutes.dto.EmployeeDTO;
import com.in60minutes.entity.Employee;
import com.in60minutes.exception.ResourceNotFoundException;
import com.in60minutes.mapper.EmployeeMapper;
import com.in60minutes.repository.EmployeeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepo employeeRepo;
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.maptoEmployee(employeeDTO);
        Employee savedEmployee = employeeRepo.save(employee);
        return EmployeeMapper.maptoEmployeeDTO(savedEmployee);
    }

    @Override
    public EmployeeDTO getEmployeeById(Long employeeId) {
        Employee employee = employeeRepo.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundException("Employee is not exists with given id : "+employeeId));
        return EmployeeMapper.maptoEmployeeDTO(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employee = employeeRepo.findAll();
        return employee.stream()
                .map((employees)->EmployeeMapper.maptoEmployeeDTO(employees))
                .collect(Collectors.toList());

    }

    @Override
    public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployee) {
       Employee employee = employeeRepo.findById(employeeId)
               .orElseThrow(()->new ResourceNotFoundException("Employee is not exists with given id : "+employeeId));
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmail());

        Employee updatedEmployeeObj = employeeRepo.save(employee);
        return EmployeeMapper.maptoEmployeeDTO(updatedEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee = employeeRepo.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundException("Employee is not exists with given id : "+employeeId));
        employeeRepo.deleteById(employeeId);
    }
}
