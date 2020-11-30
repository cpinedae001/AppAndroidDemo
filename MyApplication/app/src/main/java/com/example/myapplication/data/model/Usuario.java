package com.example.myapplication.data.model;

public class Usuario {
    private String usuario;
    private String contraseña;
    private String activo;

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, String activo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.activo = activo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", activo='" + activo + '\'' +
                '}';
    }
}
