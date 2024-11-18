
import java.util.Scanner;

public class Ejercicio12Bucles {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca n: ");
        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                System.out.print("0");
                break;
            case 2:
                System.out.print("0 1");
                break;
            default:
                System.out.print("0 1");
                int f1 = 0;
                int f2 = 1;
                int aux;
                while (numero > 2) {
                    aux = f1;
                    f1 = f2;
                    f2 = aux + f2;
                    System.out.print(" " + f2);
                    numero--;

                }
                sc.close();
        }
    }
}
