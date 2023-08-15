package org.example.validaciones;

public class LocalValidacion {
    //metodos ordinarios

    public void validarNit(String nit) throws Exception {

        if (!nit.matches("^[0-9]+$")) {
            throw new Exception("Error en el NIT: debe contener solo números");
        }

        if (nit.length() != 10) {
            throw new Exception("Error en el NIT: debe tener exactamente 10 caracteres");
        }
    }

    public Boolean validarNombre(String nombre) throws Exception {
        if (nombre == null) {
            throw new Exception("El nombre no puede ser nulo");
        }
        if (nombre.length() > 30) {
            throw new Exception("El nombre de la empresa no puede sobrepasar los 30 caracteres");
        }
        if (!nombre.matches("^[a-zA-Z]+$")) {
            throw new Exception("El nombre no puede contener números ni espacios");
        }
        return true;
    }
}
