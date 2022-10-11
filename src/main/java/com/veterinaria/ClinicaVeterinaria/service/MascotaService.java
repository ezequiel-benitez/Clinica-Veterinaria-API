
package com.veterinaria.ClinicaVeterinaria.service;

import com.veterinaria.ClinicaVeterinaria.dto.MascotaDTO;
import com.veterinaria.ClinicaVeterinaria.model.Mascota;
import com.veterinaria.ClinicaVeterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    IMascotaRepository mascotaRepo;

    @Override
    public void saveMascota(Mascota mascota) {
    mascotaRepo.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
    mascotaRepo.deleteById(id);
    }

    @Override
    public void editMascota(Mascota mascota) {
    this.saveMascota(mascota);
    }

    @Override
    public List<Mascota> getMascotas() {
    return mascotaRepo.findAll();
    }

    @Override
    public Mascota findMascota(Long id) {
    return mascotaRepo.findById(id).orElse(null);
    }

    @Override
    public MascotaDTO datosMascotaDueno(Long idMascota) {
    MascotaDTO mascotaDTO = new MascotaDTO();
    Mascota mascota = this.findMascota(idMascota);
    
    mascotaDTO.setNombre_mascota(mascota.getNombre());
    mascotaDTO.setEspecie(mascota.getEspecie());
    mascotaDTO.setRaza(mascota.getRaza());
    mascotaDTO.setNombre_dueno(mascota.getUnDueno().getNombre());
    mascotaDTO.setApellido_dueno(mascota.getUnDueno().getApellido());
    
    return mascotaDTO;
    }

    @Override
    public List<Mascota> getPerrosCaniches() {
    
        String perro = "Perro";
        String caniche = "Caniche";
        
        String especieComparar;
    
        String razaComparar;
    
        List<Mascota> listaMascotas = this.getMascotas();
        
        List<Mascota> listaPerrosCaniches = new ArrayList<Mascota>();
        
        for (Mascota mascota : listaMascotas){
            
            razaComparar = mascota.getRaza();
            especieComparar = mascota.getEspecie();
            
            boolean contienePerroCaniche = especieComparar.contains(perro) && razaComparar.contains(caniche);
            
            if(contienePerroCaniche){
            listaPerrosCaniches.add(mascota);
            }
        }
        
        return listaPerrosCaniches;
    }
    
    
}
