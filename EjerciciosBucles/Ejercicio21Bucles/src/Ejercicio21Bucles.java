
import java.util.Scanner;

public class Ejercicio21Bucles {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int numero;
       for (int i = 0; i < 10; i++) {
           System.out.println("Introduzca los numeros por pantalla");
           numero = sc.nextInt();
       }
       sc.close();
    }
}
