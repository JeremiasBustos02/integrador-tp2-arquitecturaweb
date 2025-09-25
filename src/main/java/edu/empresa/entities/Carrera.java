package edu.empresa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Carrera {
    @Id
    private int idCarrera;
    @Column
    private String nombre;
    @Column
    private int duracion;

    @ManyToMany
    private List<Estudiante> estudiantes;
}
