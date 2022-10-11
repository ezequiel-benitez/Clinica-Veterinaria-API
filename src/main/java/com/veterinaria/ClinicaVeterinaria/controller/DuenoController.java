
package com.veterinaria.ClinicaVeterinaria.controller;

import com.veterinaria.ClinicaVeterinaria.model.Dueno;
import com.veterinaria.ClinicaVeterinaria.service.IDuenoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DuenoController {
    
    @Autowired
    private IDuenoService duenoServ;
    
    //Create Read Update Delete
    
    //Create - Dar de alta un dueño
    @PostMapping("/dueno/crear")
    public String saveDueno(@RequestBody Dueno dueno){
    duenoServ.saveDueno(dueno);
    return "Dueño agregado a la base de datos con exito";
    }
    
    //Read - Obtener dueño por Id
    @GetMapping("/read/dueno/{id}")
    public Dueno getDueno(@PathVariable Long id){
    return duenoServ.findDueno(id);
    }
    
    //Update - modificar un dueño
    @PutMapping("/update/dueno")
    public String editDueno(@RequestBody Dueno dueno){
    duenoServ.editDueno(dueno);
    return "Modificacion realizada con exito";
    }

    //Delete - borrar un dueño
    @DeleteMapping("/delete/dueno/{id}")
    public String deleteDueno(@PathVariable Long id){
    
        duenoServ.deleteDueno(id);
    
        return "Dueño borrado con exito";
    }
    
    
    //Obtener listado de dueños
    @GetMapping("/lista/duenos")
    public List<Dueno> getDuenos(){
    return duenoServ.getDuenos();
    }
    
    
}
