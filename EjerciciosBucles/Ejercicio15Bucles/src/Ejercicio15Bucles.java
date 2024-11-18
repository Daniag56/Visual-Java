
import java.util.Scanner;

public class Ejercicio15Bucles {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int base, exponente, potencia;
        System.out.println("Introduce la base: ");
        base = sc.nextInt();
        System.out.println("Introduce el exponente: ");
        exponente = sc.nextInt();
        for (int i = 1; i <= exponente; i++) {
            potencia = base * exponente;
            System.out.println("Potencia: "+base+"^"+i);
        }
        sc.close();
    }
}
