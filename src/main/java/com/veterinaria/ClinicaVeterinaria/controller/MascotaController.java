
package com.veterinaria.ClinicaVeterinaria.controller;

import com.veterinaria.ClinicaVeterinaria.dto.MascotaDTO;
import com.veterinaria.ClinicaVeterinaria.model.Mascota;
import com.veterinaria.ClinicaVeterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
public class MascotaController {
    
    @Autowired
    private IMascotaService mascotaServ;
    
    //Create Read Update Delete
    
     //Create - Dar de alta una mascota
    @PostMapping("/create/mascota")
    public String saveMascota(@RequestBody Mascota mascota){
    
        mascotaServ.saveMascota(mascota);
    
        return "Mascota agregada con exito a la DB";
    }
    
    //Read - Obtener mascota por Id
    @GetMapping("/read/mascota/{id}")
    public Mascota getMascota(@PathVariable Long id){
    return mascotaServ.findMascota(id);
    }
    
    //Update - modificar mascota
    @PutMapping("/update/mascota")
    public String updateMascota(@RequestBody Mascota mascota){
    mascotaServ.editMascota(mascota);
    return "Mascota modificada con exito";
    }
    
    //Delete - eliminar mascota
    @DeleteMapping ("/delete/mascota/{id}")
    public String deleteMascota(@PathVariable Long id){
    mascotaServ.deleteMascota(id);
    return "Mascota eliminada con exito";
    }
    
    //Obtener listado de mascotas
    @GetMapping("/lista/mascotas")
    public List<Mascota> getMascotas(){
    return mascotaServ.getMascotas();
    }
    
    //obtener lista de mascotas esperice "Perro" y raza "Caniche"
    @GetMapping("/lista/perrosCaniche")
    public List<Mascota> getPerrosCaniche(){
    return mascotaServ.getPerrosCaniches();
    }
    
    //obtener datos combinados de Mascota y dueño
    @GetMapping("/read/mascotaDueno/{id}")
    public MascotaDTO getMascotaDueno(@PathVariable Long idMascota){
    return mascotaServ.datosMascotaDueno(idMascota);
    }
}
