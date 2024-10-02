package org.example.Modelos;

import java.time.LocalDate;

public class Sucursal {
    private Long id;
    private String nombreSucursal;
    private String direccion;
    private String telefono;
    private String correoSucursal;
    private String nombreGerente;
    private LocalDate fechaApertura;
    private Integer numeroEmpleados;
    private String horarioAtencion;
    private String estadoOperativo;

    public Sucursal() {
    }

    public Sucursal(Long id, String nombreSucursal, String direccion, String telefono, String correoSucursal, String nombreGerente, LocalDate fechaApertura, Integer numeroEmpleados, String horarioAtencion, String estadoOperativo) {
        this.id = id;
        this.nombreSucursal = nombreSucursal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoSucursal = correoSucursal;
        this.nombreGerente = nombreGerente;
        this.fechaApertura = fechaApertura;
        this.numeroEmpleados = numeroEmpleados;
        this.horarioAtencion = horarioAtencion;
        this.estadoOperativo = estadoOperativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoSucursal() {
        return correoSucursal;
    }

    public void setCorreoSucursal(String correoSucursal) {
        this.correoSucursal = correoSucursal;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(String estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }
}
