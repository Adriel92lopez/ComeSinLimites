package com.example.comesinlmites.Entidad;

public class Comida {
    private int id;
    private int id_local;
    private int id_tipo;
    private int id_gusto;
    private String nombre;
    private String descripcion;
    private String imagen;

    //Contructor-------------
    public Comida(int id, int id_local, int id_tipo, int id_gusto, String nombre, String descripcion, String imagen) {
        this.id = id;
        this.id_local = id_local;
        this.id_tipo = id_tipo;
        this.id_gusto = id_gusto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    //Sets and Gests--------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_local() {
        return id_local;
    }
    public void setId_local(int id_local) {
        this.id_local = id_local;
    }
    public int getId_tipo() {
        return id_tipo;
    }
    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }
    public int getId_gusto() {
        return id_gusto;
    }
    public void setId_gusto(int id_gusto) {
        this.id_gusto = id_gusto;
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
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
