/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.ClinicaVeterinaria.service;

import com.veterinaria.ClinicaVeterinaria.model.Dueno;
import java.util.List;


public interface IDuenoService {
    
    //ABML
    
    //Alta Dueño
    public void saveDueno(Dueno dueno);
    
    //Baja
    public void deleteDueno(Long id);
    
    //Modificacion
    public void editDueno(Dueno dueno);
    
    //Traer lista de dueños
    public List<Dueno> getDuenos();
    
    //metodo para encontrar un dueño
    public Dueno findDueno(Long id);
}
