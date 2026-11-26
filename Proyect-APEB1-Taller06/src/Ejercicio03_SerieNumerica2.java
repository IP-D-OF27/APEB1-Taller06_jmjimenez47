/**
 * Ejercicio 03: Serie numérica 2: Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * @author John Jimenez
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio03_SerieNumerica2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int denominador = 10, numerador = 5;
        for (int cont1 = 1; cont1 <=6; cont1 ++){
            System.out.println(numerador + "/" + denominador);
            numerador +=5;
            denominador +=2;
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * 
 */