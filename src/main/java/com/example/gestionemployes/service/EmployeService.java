package com.example.gestionemployes.service;

import com.example.gestionemployes.dao.IEmployeDao;
import com.example.gestionemployes.model.Employe;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService implements IEmployeService {

    private final IEmployeDao employeDao;

    EmployeService(IEmployeDao cd){
        this.employeDao = cd;
    }

    @Override
    public Employe createEmploye(Employe Employe) {
        return this.employeDao.createEmploye(Employe);
    }

    @Override
    public Employe updateEmploye(Employe Employe) {
        return this.employeDao.createEmploye(Employe);
    }

    @Override
    public Optional<Employe> getEmploye(Long id) {

        return this.employeDao.getEmploye(id);


    }

    @Override
    public List<Employe> getAllEmploye() {
        return this.employeDao.getAllEmploye();
    }

    @Override
    public void removeEmploye(Long id) {
        this.employeDao.removeEmploye(id);
    }

    @Override
    public void removeAllEmploye() {
        this.employeDao.removeAllEmploye();
    }
}
