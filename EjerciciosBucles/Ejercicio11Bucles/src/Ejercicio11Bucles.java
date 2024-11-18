
import java.util.Scanner;

public class Ejercicio11Bucles {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();
        for (int i = 0; i <= 5; i++) {
            System.out.print(Math.pow(numero, 2));System.out.print(" "); System.out.println(Math.pow(numero, 3));
            numero ++;
        }
        sc.close();
    }
}
