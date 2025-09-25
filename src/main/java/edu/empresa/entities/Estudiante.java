package edu.empresa.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Estudiante {
    @Id
    private int lu;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private int edad;
    @Column
    private String genero;
    @Column(unique = true)
    private int dni;
    @Column
    private String ciudad;

    @ManyToMany(mappedBy = "personas", fetch = FetchType.LAZY)
    private List<Carrera> carreras;


}
