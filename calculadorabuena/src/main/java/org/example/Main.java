import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("¡Bienvenido a la calculadora simple!");

        while (continuar) {
            try {

                System.out.print("Introduce el primer número entero: ");
                int operando1 = scanner.nextInt();


                System.out.print("Introduce el signo de la operación (+, -, /, x, R): ");
                String operacion = scanner.next();


                int operando2 = 0;
                if (!operacion.equalsIgnoreCase("R")) {
                    System.out.print("Introduce el segundo número entero: ");
                    operando2 = scanner.nextInt();
                }


                switch (operacion) {
                    case "+":
                        System.out.println("Resultado: " + (operando1 + operando2));
                        break;
                    case "-":
                        System.out.println("Resultado: " + (operando1 - operando2));
                        break;
                    case "x":
                    case "X":
                        System.out.println("Resultado: " + (operando1 * operando2));
                        break;
                    case "/":
                        if (operando2 == 0) {
                            System.out.println("Error: No se puede dividir entre cero.");
                        } else {
                            System.out.println("Resultado: " + (operando1 / operando2));
                        }
                        break;
                    case "R":
                        if (operando1 < 0) {
                            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                        } else {
                            System.out.println("Resultado: " + Math.sqrt(operando1));
                        }
                        break;
                    default:
                        System.out.println("Operación no reconocida. Inténtalo de nuevo.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Debes introducir números enteros.");
                scanner.next(); 
            }


            System.out.print("¿Quieres realizar otra operación? (S/N): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        System.out.println("¡Gracias por usar la calculadora!");
        scanner.close();
    }
}
