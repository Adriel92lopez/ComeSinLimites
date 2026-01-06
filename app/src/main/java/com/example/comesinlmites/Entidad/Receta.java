package com.example.comesinlmites.Entidad;

public class Receta {
    private int id;
    private int id_gusto;
    private int id_tipoXcomida;
    private String nombre;
    private String descripcion;

    //Constructor--------------------
    public Receta(int id, int id_gusto, int id_tipoXcomida, String nombre, String descripcion) {
        this.id = id;
        this.id_gusto = id_gusto;
        this.id_tipoXcomida = id_tipoXcomida;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    //Sets and Gets------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_gusto() {
        return id_gusto;
    }
    public void setId_gusto(int id_gusto) {
        this.id_gusto = id_gusto;
    }
    public int getId_tipoXcomida() {
        return id_tipoXcomida;
    }
    public void setId_tipoXcomida(int id_tipoXcomida) {
        this.id_tipoXcomida = id_tipoXcomida;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
