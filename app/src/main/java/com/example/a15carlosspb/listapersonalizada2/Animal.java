package com.example.a15carlosspb.listapersonalizada2;

/**
 * Created by a15carlosspb on 08/02/2017.
 */

public class Animal {

    private int foto;
    private String nombre;
    private String descripcion;
    private int icono;

    public Animal() {
    }

    public Animal(int foto, String nombre, String descripcion, int icono) {
        this.foto = foto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.icono = icono;
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

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }
}
