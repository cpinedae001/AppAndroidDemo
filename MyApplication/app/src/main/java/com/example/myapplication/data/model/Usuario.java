package com.example.myapplication.data.model;

import java.util.Date;

public class Usuario {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String usuario;
    private String contrasena;
    private String activo;
    private Date fecha_creacion;
    private Persona personaId;

    public Usuario() {
    }

    public Usuario(Integer id, String usuario, String contrasena, String activo, Date fecha_creacion, Persona personaId) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.activo = activo;
        this.fecha_creacion = fecha_creacion;
        this.personaId = personaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", activo='" + activo + '\'' +
                ", fecha_creacion=" + fecha_creacion +
                '}';
    }
}
