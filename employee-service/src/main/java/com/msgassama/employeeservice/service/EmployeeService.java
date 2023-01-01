package com.msgassama.employeeservice.service;

import com.msgassama.employeeservice.dto.APIResponseDTO;
import com.msgassama.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDTO getEmployeeById(Long employeeId);
}
