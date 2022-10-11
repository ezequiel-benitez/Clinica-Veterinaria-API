/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.ClinicaVeterinaria.service;

import com.veterinaria.ClinicaVeterinaria.model.Dueno;
import com.veterinaria.ClinicaVeterinaria.repository.IDuenoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenoService implements IDuenoService{
    
    @Autowired
    IDuenoRepository duenoRepo;

    @Override
    public void saveDueno(Dueno dueno) {
    duenoRepo.save(dueno);
    }

    @Override
    public void deleteDueno(Long id) {
     duenoRepo.deleteById(id);
    }

    @Override
    public void editDueno(Dueno dueno) {
    this.saveDueno(dueno);
    }

    @Override
    public List<Dueno> getDuenos() {
    return duenoRepo.findAll();
    }

    @Override
    public Dueno findDueno(Long id) {
    return duenoRepo.findById(id).orElse(null);
    
    }
    
}
