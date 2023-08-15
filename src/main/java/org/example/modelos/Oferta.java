package org.example.modelos;

import org.example.validaciones.LocalValidacion;
import org.example.validaciones.OfertaValidacion;

import java.time.LocalDate;

public class Oferta {
    private int id;
    private String titulo;
    private String descripcion;
    private LocalDate fechainicio;
    private LocalDate fechafin;
    private double costopersona;
    private int idlocal;

    private OfertaValidacion validaciones= new OfertaValidacion();

    public Oferta() {
    }

    public Oferta(int id, String titulo, String descripcion, LocalDate fechainicio, LocalDate fechafin, double costopersona, int idlocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.costopersona = costopersona;
        this.idlocal = idlocal;
    }

    @Override
    public String toString() {
        return "Oferta " +
                "id: " + id +
                ", titulo: '" + titulo + '\'' +
                ", descripcion: '" + descripcion + '\'' +
                ", fecha inicio: " + fechainicio +
                ", fecha fin: " + fechafin +
                ", costo persona: " + costopersona +
                ", id local: " + idlocal +
                ' ';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try {
            this.validaciones.validarTitulo(titulo);
            this.titulo = titulo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public double getCostopersona() {
        return costopersona;
    }

    public void setCostopersona(double costopersona) {
        this.costopersona = costopersona;
    }

    public int getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(int idlocal) {
        this.idlocal = idlocal;
    }
}
