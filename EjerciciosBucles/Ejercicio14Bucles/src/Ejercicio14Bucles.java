
import java.util.Scanner;

public class Ejercicio14Bucles {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int base, exponente, potencia, contador = 0;
        for (int i = 1; i < 10; i++) {
            System.out.println("Introduzca la base: ");
            base = sc.nextInt();
            System.out.println("Introduce el exponente: ");
            exponente = sc.nextInt();
            potencia = base * exponente;
            System.out.println("La potencia es: "+ potencia);
        }
        sc.close();
    }
}
