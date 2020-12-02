package com.example.myapplication.data.model;

import java.util.Date;

public class CatTipoUsuario {

    private Integer id;
    private String tipoPermiso;
    private String activo;
    private Date fechaCreacion;

    public CatTipoUsuario() {
    }

    public CatTipoUsuario(Integer id, String tipoPermiso, String activo, Date fechaCreacion) {
        this.id = id;
        this.tipoPermiso = tipoPermiso;
        this.activo = activo;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
