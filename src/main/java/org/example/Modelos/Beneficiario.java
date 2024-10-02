package org.example.Modelos;

import java.time.LocalDate;

public class Beneficiario {
    private Long id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String RelacionEmpleado;
    private String numeroDocumento;
    private String telefono;
    private String correo;
    private LocalDate fechaInclusion;
    private String estadoCivil;
    private String beneficiosAsignados;

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombre, LocalDate fechaNacimiento, String relacionEmpleado, String numeroDocumento, String telefono, String correo, LocalDate fechaInclusion, String estadoCivil, String beneficiosAsignados) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        RelacionEmpleado = relacionEmpleado;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaInclusion = fechaInclusion;
        this.estadoCivil = estadoCivil;
        this.beneficiosAsignados = beneficiosAsignados;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRelacionEmpleado() {
        return RelacionEmpleado;
    }

    public void setRelacionEmpleado(String relacionEmpleado) {
        RelacionEmpleado = relacionEmpleado;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaInclusion() {
        return fechaInclusion;
    }

    public void setFechaInclusion(LocalDate fechaInclusion) {
        this.fechaInclusion = fechaInclusion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getBeneficiosAsignados() {
        return beneficiosAsignados;
    }

    public void setBeneficiosAsignados(String beneficiosAsignados) {
        this.beneficiosAsignados = beneficiosAsignados;
    }
}
