package com.example.gestionemployes.service;

import com.example.gestionemployes.model.Employe;

import java.util.List;
import java.util.Optional;

public interface IEmployeService {
    Employe createEmploye(Employe employe);
    Employe updateEmploye(Employe employe);
    Optional<Employe> getEmploye(Long id);
    List<Employe> getAllEmploye();
    void removeEmploye(Long id);
    void removeAllEmploye();
}
