package com.example.demo;

import java.util.List;

public class Paciente {
    private int id;
    private String rut;
    private String nombre;
    private List<Historial> historial;
    private List<Atencion> atencion;

    public Paciente(int id, String rut, String nombre, List<Historial> historial, List<Atencion> atencion){
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.historial = historial;
        this.atencion = atencion;
    }

    //GETTER
    public int getId(){
        return id;
    }

    public String getRut(){
        return rut;
    }

    public String getNombre(){
        return nombre;
    }

    public List<Historial> getHistorial(){
        return historial;
    }

    public List<Atencion> getAtencion(){
        return atencion;
    }

}
