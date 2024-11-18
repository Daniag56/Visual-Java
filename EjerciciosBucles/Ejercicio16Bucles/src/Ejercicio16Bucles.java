
import java.util.Scanner;

public class Ejercicio16Bucles {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();
        for (int i = 0; i <= numero; i++) {
            if (numero % 2==0) {
                System.out.print("El numero es par");
            }else{
                System.out.print("El numero es impar");
                i++;
            }
        }
        sc.close();
    }
}
