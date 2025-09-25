package edu.empresa.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Carrera {
    @Id
    private int idCarrera;
    @Column
    private String nombre;
    @Column
    private int duracion;

    @ManyToMany(mappedBy = "carreras", fetch = FetchType.LAZY)
    private List<Estudiante> estudiantes;
}
