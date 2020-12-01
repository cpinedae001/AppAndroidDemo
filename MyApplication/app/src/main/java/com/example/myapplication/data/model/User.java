package com.example.myapplication.data.model;

public class User {

    private String nombre;
    private String edad;
    private String activo;

    public User() {
    }

    public User(String nombre, String edad, String activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
