package com.example.gestionemployes.dao;

import com.example.gestionemployes.dao.repository.EmployeRepository;
import com.example.gestionemployes.model.Employe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeDao implements IEmployeDao {

    private final EmployeRepository employeRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeDao.class);

    EmployeDao(EmployeRepository er){
        this.employeRepository = er;
    }


    @Override
    public Employe createEmploye(Employe Employe) {
        return this.employeRepository.save(Employe);
    }

    @Override
    public Optional<Employe> getEmploye(Long id) {
        return this.employeRepository.findById(id);
    }

    @Override
    public Employe updateEmploye(Employe Employe) {
        return this.employeRepository.save(Employe);
    }

    @Override
    public void removeEmploye(Long id) {
        try{
            this.employeRepository.deleteById(id);
        }catch(EmptyResultDataAccessException e){
            LOGGER.error(e.getMessage());
        }
    }

    @Override
    public void removeAllEmploye() {
        this.employeRepository.deleteAll();
    }

    @Override
    public List<Employe> getAllEmploye() {
        return this.employeRepository.findAll();
    }
}
