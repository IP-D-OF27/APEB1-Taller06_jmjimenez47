/**
 * Ejercicio 01: Adivina un número: 
 * Dada la dinámica de juego computacional, programar una solución que genere un número entero aleatorio entre 1-N, 
 * y solicite al usuario lo adivine; dé pistas si es que el usuario falla, advirtiendo la cantidad de intentos restantes. 
 * Si es que no logra adivinar, muestre el mensaje "GAME OVER".
 * @author John Jimenez
 * @version 1.0
 */
import java.util.Scanner;
import java.util.Random;
public class Ejercicio01_AdivinaNumero {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random();
        int numAle = ale.nextInt(21);
        int numAdv = 0,  intentos;
        System.out.print("Ingrese el numero de intentos que quiere: ");
        intentos = tcl.nextInt();
        System.out.print("Adivine un numero del 1 al 20: ");
        while (intentos > 0){
            numAdv = tcl.nextInt();
            intentos--;
            if (numAdv == numAle){
                System.out.println("Felicidades, adivinaste");
                break;
            } else {
                System.out.println("Te quedan " + intentos + " intentos");
                if (numAle > numAdv) {
                    System.out.println("El numero es mayor");
                } else {
                    System.out.println("El numero es menor");
                }
                System.out.print("Vuelve a intentar: ");
            }
        }
        if (numAle != numAdv){
            System.out.println("\nGAME OVER");
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */