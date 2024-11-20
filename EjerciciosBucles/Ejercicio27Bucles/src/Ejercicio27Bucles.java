
import java.util.Scanner;

public class Ejercicio27Bucles {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero, multiplo = 0, suma=0;
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                multiplo++;
                System.out.println("Los divisores de tres: "+ i);
                suma += i;
            }
        }
        System.out.println("El numero de los multiplos es: "+ multiplo);
        System.out.println("La suma de los divisores es: "+suma);
        sc.close();
    }
}
