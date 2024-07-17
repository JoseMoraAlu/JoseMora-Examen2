package josemora_examen2_ejercicio4;

import java.util.Scanner;

public class JoseMora_Examen2_Ejercicio4 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para calcular su factorial:");
        int numeroFactorial = obtenerNumeroEntero(scanner);

        System.out.println("Ingrese la base de la potencia:");
        int basePotencia = obtenerNumeroEntero(scanner);

        System.out.println("Ingrese el exponente de la potencia:");
        int exponentePotencia = obtenerNumeroEntero(scanner);

        long resultado = calcularMultiplicacion(numeroFactorial, basePotencia, exponentePotencia);
        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }

    public static int obtenerNumeroEntero(Scanner scanner) {
        while (true) {
            System.out.print("Ingrese un valor: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Por favor, ingrese número válido.");
                scanner.next();
            }
        }
    }

    // se crea la recursividad para calcular la muntiplicacion y el resultado de la potencia
    public static long calcularMultiplicacion(int numeroFactorial, int basePotencia, int exponentePotencia) {
        long factorial = calcularFactorial(numeroFactorial);
        long potencia = (long) Math.pow(basePotencia, exponentePotencia);
        return factorial * potencia;
    }

    // se crea la recursividad para calcular el factorial
    public static long calcularFactorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
}
    
    

