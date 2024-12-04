
import funciones.Matematicas;
import java.util.Scanner;

public class Ejercicio1Funciones{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número: ");
        numero = sc.nextInt();
        if (Matematicas.esPrimo(numero)==true) {
            System.out.println("El numero es primo");
        }else{
            System.out.println("No es primo");
        }
        System.out.println(Matematicas.esPrimo(numero));
        sc.close();
    }
}
