package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionRegular {
    public boolean validarCadena (String cadena, String expresionregular){
        Pattern patron = Pattern.compile(expresionregular);
        Matcher matcher = patron.matcher(cadena);
        return matcher.matches();
    }
}
