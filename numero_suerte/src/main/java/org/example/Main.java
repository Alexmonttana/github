package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
        String fechanacimiento = entrada.nextLine();

        String[] partes = fechanacimiento.split("[/\\-]");

        if (partes.length != 3) {
            System.out.println("La fecha introducida no es válida. Usa el formato dd/mm/aaaa.");
            return;
        }

        int dia, mes, año;
        try {

            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            año = Integer.parseInt(partes[2]);

        } catch (NumberFormatException e) {
            System.out.println("La fecha introducida contiene valores no numericos");
            return;
        }

        if (mes < 1 || mes > 12) {
            System.out.println("el mes introducido no es correcto");
            return;

            }
        if (dia<1 || dia>31) {
            System.out.println("el dia introducido no es correcto.");
            return;
        }
        int suma = dia + mes + año;
        int numeroSuerte = sumarDigitos(suma);
        System.out.println("Tu número de la suerte es: " + numeroSuerte);
    }

    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;

    }
}
