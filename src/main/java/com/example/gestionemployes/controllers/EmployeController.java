package com.example.gestionemployes.controllers;

import com.example.gestionemployes.dto.EmployeDto;
import com.example.gestionemployes.model.Employe;
import com.example.gestionemployes.service.IEmployeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeController implements IEmployeController{

    private final IEmployeService employeService;

    private final ModelMapper mapper;



    @Override
    public EmployeDto createEmploye(EmployeDto employeDto) {
        Employe employe = mapper.map(employeDto, Employe.class);
        return mapper.map(employeService.createEmploye(employe), EmployeDto.class);
    }

    @Override
    public List<EmployeDto> getAllEmploye() {
        return this.employeService.getAllEmploye().stream().map(employe -> mapper.map(employe,EmployeDto.class))
                .collect(Collectors.toList());

    }

    @Override
    public EmployeDto getOneEmploye(Long id) {
        return mapper.map(employeService.getEmploye(id), EmployeDto.class);
    }

    @Override
    public EmployeDto updateOneEmploye(Long id, EmployeDto employeDto) {
        Employe employe = mapper.map(employeDto,Employe.class);
        employe.setIdUser(id);
        return mapper.map(employeService.updateEmploye(employe), EmployeDto.class);
    }

    @Override
    public void deleteOneEmploye(Long id) {
        employeService.removeEmploye(id);
    }

    @Override
    public void deleteAllEmploye() {
        employeService.removeAllEmploye();
    }
}
