package com.example.myapplication.data.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DetalleCotizacion {

    private static final long serialVersionUID = 1L;
    private Long id;
    private BigInteger numeroLinea;
    private String bienServicio;
    private String descripcion;
    private BigDecimal precioUnitario;
    private Integer cantidad;
    private BigDecimal totalLinea;
    private BigDecimal totalIvaLinea;
    private Cotizacion cotizacionid;
    private Producto productoid;

    public DetalleCotizacion() {
    }

    public DetalleCotizacion(Long id, BigInteger numeroLinea, String bienServicio, String descripcion, BigDecimal precioUnitario, Integer cantidad, BigDecimal totalLinea, BigDecimal totalIvaLinea, Cotizacion cotizacionid, Producto productoid) {
        this.id = id;
        this.numeroLinea = numeroLinea;
        this.bienServicio = bienServicio;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.totalLinea = totalLinea;
        this.totalIvaLinea = totalIvaLinea;
        this.cotizacionid = cotizacionid;
        this.productoid = productoid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(BigInteger numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public String getBienServicio() {
        return bienServicio;
    }

    public void setBienServicio(String bienServicio) {
        this.bienServicio = bienServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotalLinea() {
        return totalLinea;
    }

    public void setTotalLinea(BigDecimal totalLinea) {
        this.totalLinea = totalLinea;
    }

    public BigDecimal getTotalIvaLinea() {
        return totalIvaLinea;
    }

    public void setTotalIvaLinea(BigDecimal totalIvaLinea) {
        this.totalIvaLinea = totalIvaLinea;
    }

    public Cotizacion getCotizacionid() {
        return cotizacionid;
    }

    public void setCotizacionid(Cotizacion cotizacionid) {
        this.cotizacionid = cotizacionid;
    }

    public Producto getProductoid() {
        return productoid;
    }

    public void setProductoid(Producto productoid) {
        this.productoid = productoid;
    }
}
