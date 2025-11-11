package com.example.saludo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenido;

    // Constructor vacío requerido por JPA (Hibernate)
    public Mensaje() {
    }

    public Mensaje(String contenido) {
        this.contenido = contenido;
    }

    // Getters y Setters (necesarios para el acceso a las propiedades)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}