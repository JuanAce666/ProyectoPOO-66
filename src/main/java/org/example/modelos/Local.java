package org.example.modelos;

import org.example.validaciones.LocalValidacion;

public class Local {
    private int id;
    private String nit;
    private String nombre;
    private int ubicacion;
    private String descripcion;

    private LocalValidacion validaciones= new LocalValidacion();

    public Local() {
    }

    public Local(int id, String nit, String nombre, int ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Local " +
                "id: " + id +
                ", nit: '" + nit + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", ubicacion: " + ubicacion +
                ", descripcion: '" + descripcion + '\'' +
                ' ';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try {
           this.validaciones.validarNit(nit);
            this.nit = nit;
        } catch (Exception e) {
            System.out.println("Error en el NIT: " + e.getMessage());
        }
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.validaciones.validarNombre(nombre);
            this.nombre = nombre;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
