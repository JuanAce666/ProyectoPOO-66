package org.example.validaciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservaValidacion {
    //metodos ordinarios
    public void validarUsuario(Integer numeroPersonas) throws IllegalArgumentException {
        if (numeroPersonas > 4) {
            throw new IllegalArgumentException("El número de personas no puede ser mayor a 4");
        }
    }

    public void validarCostototal(Double costoTotal) throws IllegalArgumentException {
        double iva = costoTotal * 0.19;
        double costoTotalConIVA = costoTotal + iva;

        if (costoTotal != costoTotalConIVA) {
            throw new IllegalArgumentException("El costo total no coincide con el costo total más el IVA");
        }
    }

    public Boolean validarFechaReserva(LocalDate FechaReserva) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = FechaReserva.format(formatter);
        return fechaFormateada.equals(FechaReserva.toString());
    }
}
