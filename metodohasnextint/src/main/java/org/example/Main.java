package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la clasificación de generaciones");
        System.out.println("Elige un modo:");
        System.out.println("Modo 1: Año de nacimiento");
        System.out.println("Modo 2: Edad");

        Scanner teclado = new Scanner(System.in);
        String modo = teclado.next();
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();


        int anyo_nacimiento = 0;

        if (modo.equals("1")) {
            System.out.println("Introduce año de nacimiento:");
            String anyo = teclado.next();
            try {
                anyo_nacimiento = Integer.parseInt(anyo);
            } catch (NumberFormatException e1) {
                System.out.println("El formato del año no es correcto: " + e1);
                return;
            }

            if (anyo_nacimiento < 1900 || anyo_nacimiento > anyo_actual) {
                System.out.println("El año de nacimiento debe estar entre 1900 y " + anyo_actual);
                return;
            }
        } else if (modo.equals("2")) {
            System.out.println("Introduce tu edad:");
            String edadStr = teclado.next();
            try {
                int edad = Integer.parseInt(edadStr);
                anyo_nacimiento = anyo_actual - edad;
            } catch (NumberFormatException e1) {
                System.out.println("El formato de la edad no es correcto: " + e1);
                return;
            }

            if (anyo_nacimiento < 1900 || anyo_nacimiento > anyo_actual) {
                System.out.println("La edad ingresada genera un año inválido.");
                return;
            }
        } else {
            System.out.println("Modo no válido. Debes elegir 1 o 2.");
            return;
        }


        if (anyo_nacimiento >= 1900 && anyo_nacimiento <= 1945) {
            System.out.println("Perteneces a la Generación Silenciosa (1900-1945)");
        } else if (anyo_nacimiento >= 1946 && anyo_nacimiento <= 1964) {
            System.out.println("Perteneces a los Baby Boomers (1946-1964)");
        } else if (anyo_nacimiento >= 1965 && anyo_nacimiento <= 1980) {
            System.out.println("Perteneces a la Generación X (1965-1980)");
        } else if (anyo_nacimiento >= 1981 && anyo_nacimiento <= 1996) {
            System.out.println("Perteneces a los Millennials (1981-1996)");
        } else if (anyo_nacimiento >= 1997 && anyo_nacimiento <= 2012) {
            System.out.println("Perteneces a la Generación Z (1997-2012)");
        } else if (anyo_nacimiento >= 2013) {
            System.out.println("Perteneces a la Generación Alpha (2013 en adelante)");
        }else{
            System.out.println("no tienes generacion");
        }
    }
}
