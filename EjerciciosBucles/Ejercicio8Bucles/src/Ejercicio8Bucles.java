
import java.util.Scanner;

public class Ejercicio8Bucles {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int numero;
       System.out.println("Introduzca un numero");
       numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero * i);
        }
       sc.close();
    }
}
