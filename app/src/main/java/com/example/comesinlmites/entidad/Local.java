package com.example.comesinlmites.entidad;

public class Local {
    private int id;
    private String nombre;
    private String direccion;
    private String ubicacion;
    private String horario;
    private String telefono;

    //Contructor------
    public Local(int id, String nombre, String direccion, String ubicacion, String horario, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.telefono = telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
