package com.example.myapplication.data.model;

import java.util.Date;

public class InventarioDetalle {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Date fechaUltimoMov;
    private Integer ingreso;
    private Integer egreso;
    private Integer cantidadExistencia;
    private Date fechaUltimaCompra;
    private Producto productoId;

    public InventarioDetalle() {
    }

    public InventarioDetalle(Integer id, Date fechaUltimoMov, Integer ingreso, Integer egreso, Integer cantidadExistencia, Date fechaUltimaCompra, Producto productoId) {
        this.id = id;
        this.fechaUltimoMov = fechaUltimoMov;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.cantidadExistencia = cantidadExistencia;
        this.fechaUltimaCompra = fechaUltimaCompra;
        this.productoId = productoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaUltimoMov() {
        return fechaUltimoMov;
    }

    public void setFechaUltimoMov(Date fechaUltimoMov) {
        this.fechaUltimoMov = fechaUltimoMov;
    }

    public Integer getIngreso() {
        return ingreso;
    }

    public void setIngreso(Integer ingreso) {
        this.ingreso = ingreso;
    }

    public Integer getEgreso() {
        return egreso;
    }

    public void setEgreso(Integer egreso) {
        this.egreso = egreso;
    }

    public Integer getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(Integer cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }

    public Date getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    public void setFechaUltimaCompra(Date fechaUltimaCompra) {
        this.fechaUltimaCompra = fechaUltimaCompra;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }
}
