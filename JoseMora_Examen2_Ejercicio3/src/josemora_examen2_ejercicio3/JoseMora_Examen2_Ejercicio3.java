package josemora_examen2_ejercicio3;

import java.util.Scanner;
import java.util.Stack;

public class JoseMora_Examen2_Ejercicio3 {

    public static void main(String[] args) {
       
        Stack<Integer> pila = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese hasta 10 valores numéricos para la pila:");
        int contador = 0;
        while (contador < 10) {
            System.out.print("Ingrese un valor: ");
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                pila.push(valor);
                contador++;
            } else {
                System.out.println("Por favor, ingrese un numero válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
        
        System.out.println("Valores originales en la pila: " + pila);
        
        invertirPila(pila);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Valores invertidos de la pila: " + pila);
    }
    
    public static void invertirPila(Stack<Integer> pila) {
        if (!pila.isEmpty()) {
            int temp = pila.pop();
            invertirPila(pila);
            insertarAlFondo(pila, temp);
        }
    }
    
    public static void insertarAlFondo(Stack<Integer> pila, int valor) {
        if (pila.isEmpty()) {
            pila.push(valor);
        } else {
            int temp = pila.pop();
            insertarAlFondo(pila, valor);
            pila.push(temp);
        }
    }
}