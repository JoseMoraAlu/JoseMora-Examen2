package josemora_examen2_ejercicio1;

import java.util.Scanner;

public class JoseMora_Examen2_Ejercicio1 {
     
    public static void main(String[] args) {
            
    Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[4];

        System.out.println("Ingrese los valores que desea ingresar:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            
            while (!scanner.hasNextInt()) {
                
                System.out.println("Por favor, ingrese un numero valido.");
                scanner.next(); 
                
                System.out.print("Valor " + (i + 1) + ": ");
            }
            arreglo[i] = scanner.nextInt();
        }

        int resultado = Suma(arreglo, arreglo.length - 1);
        System.out.println("La suma de los elementos del arreglo es: " + resultado);

        scanner.close();
    }

    // se crea la recursividad para hacer las sumas del arreglo
    public static int Suma(int[] arreglo, int indice) {
        if (indice < 0) {
            return 0;
        } else {
            return arreglo[indice] + Suma(arreglo, indice - 1);
        }
    }

}