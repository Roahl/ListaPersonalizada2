package com.example.a15carlosspb.listapersonalizada2;

/**
 * Created by a15carlosspb on 08/02/2017.
 */

public class Animal {

    private int foto;
    private String nombre;
    private String descripcion;

    public Animal() {
    }

    public Animal(int foto, String nombre, String descripcion) {
        this.foto = foto;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
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
