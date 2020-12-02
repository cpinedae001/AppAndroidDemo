package com.example.myapplication.data.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Cotizacion {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String serie;
    private Date fecha;
    private String anulada;
    private String observaciones;
    private Date fechaAnulacion;
    private BigDecimal totalBruto;
    private BigDecimal totalNeto;
    private BigDecimal totalImpuesto;
    private BigDecimal totalDescuento;
    private List<DetalleCotizacion> detalleCotizacionList;
    private Persona personaId;
    private Usuario usuarioId;

    public Cotizacion() {
    }

    public Cotizacion(Long id, String serie, Date fecha, String anulada, String observaciones, Date fechaAnulacion, BigDecimal totalBruto, BigDecimal totalNeto, BigDecimal totalImpuesto, BigDecimal totalDescuento, List<DetalleCotizacion> detalleCotizacionList, Persona personaId, Usuario usuarioId) {
        this.id = id;
        this.serie = serie;
        this.fecha = fecha;
        this.anulada = anulada;
        this.observaciones = observaciones;
        this.fechaAnulacion = fechaAnulacion;
        this.totalBruto = totalBruto;
        this.totalNeto = totalNeto;
        this.totalImpuesto = totalImpuesto;
        this.totalDescuento = totalDescuento;
        this.detalleCotizacionList = detalleCotizacionList;
        this.personaId = personaId;
        this.usuarioId = usuarioId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAnulada() {
        return anulada;
    }

    public void setAnulada(String anulada) {
        this.anulada = anulada;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(Date fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public BigDecimal getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(BigDecimal totalBruto) {
        this.totalBruto = totalBruto;
    }

    public BigDecimal getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(BigDecimal totalNeto) {
        this.totalNeto = totalNeto;
    }

    public BigDecimal getTotalImpuesto() {
        return totalImpuesto;
    }

    public void setTotalImpuesto(BigDecimal totalImpuesto) {
        this.totalImpuesto = totalImpuesto;
    }

    public BigDecimal getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(BigDecimal totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public List<DetalleCotizacion> getDetalleCotizacionList() {
        return detalleCotizacionList;
    }

    public void setDetalleCotizacionList(List<DetalleCotizacion> detalleCotizacionList) {
        this.detalleCotizacionList = detalleCotizacionList;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }
}
