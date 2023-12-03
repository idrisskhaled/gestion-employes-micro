package com.example.gestionemployes.controllers;

import com.example.gestionemployes.dto.EmployeDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RequestMapping("api/employee")
public interface IEmployeController {
    @PostMapping()
    EmployeDto createEmploye(@RequestBody @Valid EmployeDto employeDto);

    @GetMapping()
    List<EmployeDto> getAllEmploye();

    @GetMapping("/{id}")
    EmployeDto getOneEmploye(@PathVariable Long id);

    @PutMapping("/{id}")
    EmployeDto updateOneEmploye(@PathVariable Long id, @RequestBody @Valid EmployeDto employeDto);

    @DeleteMapping("/{id}")
    void deleteOneEmploye(@PathVariable Long id);

    @DeleteMapping("")
    void deleteAllEmploye();
}
