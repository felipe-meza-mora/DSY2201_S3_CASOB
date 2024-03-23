package com.example.demo;

import java.time.LocalDate;

public class Historial {
    private int id;
    private LocalDate fecha;
    private String tipo;
    private String descripcion;

    
    public Historial(int id, LocalDate fecha, String tipo, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    // Getters
    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    
}
