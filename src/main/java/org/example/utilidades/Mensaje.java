package org.example.utilidades;

public enum Mensaje {

    FORMATO_NOMBRE("your name does not fulfill the requirements"),
    LONGITUD_NOMBRE("your name is to short");
    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


}
