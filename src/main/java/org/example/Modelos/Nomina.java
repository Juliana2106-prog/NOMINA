package org.example.Modelos;

import java.time.LocalDate;

public class Nomina {
    private Long id;
    private String nombre;
    private String cargo;
    private String departamento;
    private LocalDate fechaContrato;
    private String tipoContrato;
    private String salarioBase;
    private Integer horasTrabajadas;
    private Integer horasExtras;
    private Integer vacacionesAcumuladas;

    public Nomina() {
    }

    public Nomina(Long id, String nombre, String cargo, String departamento, LocalDate fechaContrato, String tipoContrato, String salarioBase, Integer horasTrabajadas, Integer horasExtras, Integer vacacionesAcumuladas) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.departamento = departamento;
        this.fechaContrato = fechaContrato;
        this.tipoContrato = tipoContrato;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.vacacionesAcumuladas = vacacionesAcumuladas;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(String salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Integer getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Integer horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Integer getVacacionesAcumuladas() {
        return vacacionesAcumuladas;
    }

    public void setVacacionesAcumuladas(Integer vacacionesAcumuladas) {
        this.vacacionesAcumuladas = vacacionesAcumuladas;
    }
}
