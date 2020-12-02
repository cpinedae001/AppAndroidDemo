package com.example.myapplication.data.model;

import java.math.BigDecimal;
import java.util.Date;

public class Producto {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nombre;
    private String descripcion;
    private Date fechaIngreso;
    private String activo;
    private BigDecimal precioUnitario;
    private BigDecimal precioVenta;
    private String tipoVentaUniPeso;
    private String presentacion;
    private String barcode;
    private String imagen;
    private CatCategoria categoriaId;

    public Producto() {
    }

    public Producto(Integer id, String nombre, String descripcion, Date fechaIngreso, String activo, BigDecimal precioUnitario, BigDecimal precioVenta, String tipoVentaUniPeso, String presentacion, String barcode, String imagen, CatCategoria categoriaId) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
        this.precioUnitario = precioUnitario;
        this.precioVenta = precioVenta;
        this.tipoVentaUniPeso = tipoVentaUniPeso;
        this.presentacion = presentacion;
        this.barcode = barcode;
        this.imagen = imagen;
        this.categoriaId = categoriaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getTipoVentaUniPeso() {
        return tipoVentaUniPeso;
    }

    public void setTipoVentaUniPeso(String tipoVentaUniPeso) {
        this.tipoVentaUniPeso = tipoVentaUniPeso;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public CatCategoria getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(CatCategoria categoriaId) {
        this.categoriaId = categoriaId;
    }
}
