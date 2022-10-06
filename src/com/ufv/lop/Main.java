package com.ufv.lop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona(); //Creas el constructor vacío, es una nueva variable (p) dentro de la clase Persona
        Perritos perro = new Perritos(); //declaramos un objeto de tpo perritos llamado perro
        Scanner nombreVariable = new Scanner(System.in);

        System.out.println("Escribe el nombre de la raza: ");
        perro.setRaza(nombreVariable.nextLine());

        System.out.println("Escribe tu nombre: ");
        p.setNombre(nombreVariable.nextLine());
        System.out.println("Escribe tu apellido: ");
        p.setApellido(nombreVariable.nextLine());
        System.out.println("Escribe tu DNI: ");
        p.setDniSinLetra(nombreVariable.nextInt());
        System.out.println("Escribe tu Edad: ");
        p.setEdad(nombreVariable.nextInt());

        System.out.println("Buenos días: " + p.getNombre());
        System.out.println("Su apellido es: " + p.getApellido());
        System.out.println("Su DNI es: " + p.getDniSinLetra());
        System.out.println("Su edad: " + p.getEdad());
        System.out.println("Su perro tiene una raza: " + perro.getRaza());


    }
}
