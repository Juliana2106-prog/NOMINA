package org.example.Modelos;

import java.time.LocalDate;

public class Area {
    private Long id;
    private String nombreArea;
    private String jefeArea;
    private Integer numeroEmpleados;
    private LocalDate fechaCreacion;
    private String descripcion;
    private String objetivos;
    private String proyectosActuales;
    private String direccion;
    private String horario;

    public Area() {
    }

    public Area(Long id, String nombreArea, String jefeArea, Integer numeroEmpleados, LocalDate fechaCreacion, String descripcion, String objetivos, String proyectosActuales, String direccion, String horario) {
        this.id = id;
        this.nombreArea = nombreArea;
        this.jefeArea = jefeArea;
        this.numeroEmpleados = numeroEmpleados;
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
        this.objetivos = objetivos;
        this.proyectosActuales = proyectosActuales;
        this.direccion = direccion;
        this.horario = horario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getJefeArea() {
        return jefeArea;
    }

    public void setJefeArea(String jefeArea) {
        this.jefeArea = jefeArea;
    }

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getProyectosActuales() {
        return proyectosActuales;
    }

    public void setProyectosActuales(String proyectosActuales) {
        this.proyectosActuales = proyectosActuales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
