/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.ClinicaVeterinaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Dueno {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_dueno;
    
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;

    public Dueno() {
    }

    public Dueno(Long id_dueno, String dni, String nombre, String apellido, String celular) {
        this.id_dueno = id_dueno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
    
    
}
