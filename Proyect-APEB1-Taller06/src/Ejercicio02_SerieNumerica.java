/**
 * Ejercicio 02: Serie numérica 1:
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * @author John Jimenez
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio02_SerieNumerica {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont1 = 1, denominador = 10, numerador = 1;
        do {
            System.out.println(numerador + "/" + denominador);
            cont1 ++;
            numerador ++;
            denominador ++;
        } while (cont1 <=6);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * 1/10
2/11
3/12
4/13
5/14
6/15
 */