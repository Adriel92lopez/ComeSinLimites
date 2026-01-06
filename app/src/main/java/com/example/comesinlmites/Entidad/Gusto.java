package com.example.comesinlmites.Entidad;

public class Gusto {
    private int id;
    private String nombre;

    //Contructor-------------------
    public Gusto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //Sets and Gets-------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
