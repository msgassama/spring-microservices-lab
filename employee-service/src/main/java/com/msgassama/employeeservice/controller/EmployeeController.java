package com.msgassama.employeeservice.controller;

import com.msgassama.employeeservice.dto.APIResponseDTO;
import com.msgassama.employeeservice.dto.EmployeeDto;
import com.msgassama.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    // build save employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    // build get employee REST API
    @GetMapping("{employee-id}")
    public ResponseEntity<APIResponseDTO> getEmployee(@PathVariable("employee-id") Long employeeId){
        APIResponseDTO  apiResponseDTO = employeeService.getEmployeeById(employeeId);

        return new ResponseEntity<>(apiResponseDTO, HttpStatus.OK);
    }
}
