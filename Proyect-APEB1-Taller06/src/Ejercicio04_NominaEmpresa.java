/**
 * Ejercicio 04: Nómina empresa: 
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. 
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo.
 * Calcular el valor a cancelar por la empresa para cada empleado.
 * @author John Jimenez
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio04_NominaEmpresa {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, result = "";
        int dias,  cont1 = 1;
        double costoDia, cancelar;
        while (cont1 <=5) {            
            System.out.print("Ingrese su nombre: \n");
            nombre = tcl.nextLine();
            System.out.print("Ingrese los dias trabajados: ");
            dias = tcl.nextInt();
            System.out.print("Ingrese el costo por dia: ");
            costoDia = tcl.nextDouble();
            cancelar = costoDia * dias;
            cont1 ++;
            result += nombre + " Costo del dia: " + costoDia + "Dias Trabajados: " + dias + " Pago: " + cancelar + "\n";
        }
        System.out.println(result);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */