
package com.veterinaria.ClinicaVeterinaria.service;

import com.veterinaria.ClinicaVeterinaria.dto.MascotaDTO;
import com.veterinaria.ClinicaVeterinaria.model.Mascota;
import java.util.List;




public interface IMascotaService {
    
     //ABML
    
    //Alta Mascota
    public void saveMascota(Mascota mascota);
    
    //Baja
    public void deleteMascota(Long id);
    
    //Modificacion
    public void editMascota(Mascota mascota);
    
    //Traer lista de mascotas
    public List<Mascota> getMascotas();
    
    //metodo para encontrar una mascota
    public Mascota findMascota(Long id);
    
    //obtener listado de todas las mascotas especie "perro" y raza "caniche"
    public List<Mascota> getPerrosCaniches();
    
    //obtener datos combinados de una mascota y su dueño
    public MascotaDTO datosMascotaDueno(Long id);
    
}
