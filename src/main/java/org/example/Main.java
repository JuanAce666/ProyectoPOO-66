package org.example;

import org.example.modelos.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        Persona objetoUsuario = new Persona();

        System.out.print("Digite sus nombres y apellidos");
        objetoUsuario.setNombre(teclado.nextLine());

        System.out.println("Digite su correo");
        objetoUsuario.setCorreo(teclado.nextLine());

        System.out.println("Digite su ubicación: ");
        Integer ubicacion = teclado.nextInt();
        objetoUsuario.setUbicacion(ubicacion);
        teclado.nextLine();

        Local objetoLocal = new Local();
        System.out.println("Digite su nit: ");
        objetoLocal.setNit(teclado.nextLine());

        System.out.println("Digite el nombre de la empresa");
        objetoLocal.setNombre(teclado.nextLine());

        Oferta objetoOferta = new Oferta();
        System.out.println("Digite el nombre del titulo");
        objetoOferta.setTitulo(teclado.nextLine());

        System.out.println("Digite la fecha validas");
        objetoOferta.
    }
}