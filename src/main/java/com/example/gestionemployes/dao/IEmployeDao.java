package com.example.gestionemployes.dao;

import com.example.gestionemployes.model.Employe;

import java.util.List;
import java.util.Optional;

public interface IEmployeDao {
    Employe createEmploye(Employe employe);
    Optional<Employe> getEmploye(Long id);
    Employe updateEmploye(Employe employe);
    void removeEmploye(Long id);
    void removeAllEmploye();
    List<Employe> getAllEmploye();
}
