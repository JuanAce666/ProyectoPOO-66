package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonaValidacion {

    private Util util = new Util();

    //metodos ordinarios
    public Boolean validarNombre(String nombres) throws Exception {
        if (!nombres.matches("^[a-zA-Z ]+$")) {
            throw new Exception(Mensaje.FORMATO_NOMBRE.getMensaje());
        }
        if (nombres.length() < 10) {
            throw new Exception(Mensaje.LONGITUD_NOMBRE.getMensaje());
        }
        return true;
    }

    public Boolean validarUbicacion(Integer ubicacion) throws Exception {
        if (ubicacion <= 4) {
            return true;
        } else {
            throw new Exception("Error en la ubicación");
        }
    }

    public  Boolean validarCorreo(String correo) throws Exception{
        String expresionRegular= "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(correo);
        if(coincidencia.matches()){
            return true;
        }else{
            throw new Exception("Usuario el nombre no puede contener numeros");
        }
    }

}
