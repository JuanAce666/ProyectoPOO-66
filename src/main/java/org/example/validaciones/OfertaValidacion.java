package org.example.validaciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OfertaValidacion {
    //metodos ordinarios

    public Boolean validarTitulo(String Titulo) throws Exception{
        if (Titulo == null){
            throw new Exception("El titulo no puede ser nulo");
        }
        if (Titulo.length() > 20){
            throw new Exception("El titulo no puede sobrepasar los 20 caracteres");
        }
        return true;
    }

    public static Boolean validarFechainicio(LocalDate fechaInicio, LocalDate fechaFin) {
        if (!validarFormatoFecha(fechaInicio) || !validarFormatoFecha(fechaFin)) {
            return false;
        }

        return !fechaInicio.isAfter(fechaFin);
    }

    private static Boolean validarFormatoFecha(LocalDate fecha) {
        String fechaStr = fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return fechaStr.equals(fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.of(2023, 8, 10);
        LocalDate fechaFin = LocalDate.of(2023, 8, 15);

        if (validarFechainicio(fechaInicio, fechaFin)) {
            System.out.println("Las fechas son válidas.");
        } else {
            System.out.println("Las fechas no son válidas según los criterios especificados.");
        }
    }

    public void validarCostoPersona(Double costoPersona) throws IllegalArgumentException {
        if (costoPersona < 0) {
            throw new IllegalArgumentException("El costo por persona no puede ser negativo.");
        }
    }


}
