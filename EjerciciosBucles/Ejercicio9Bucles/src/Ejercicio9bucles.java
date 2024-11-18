
import java.util.Scanner;

public class Ejercicio9bucles {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long numero, numerodeDigitos = 1;
        System.out.print("Introduzca un numero por pantalla: ");
        numero = sc.nextInt();

        while (numero > 10) { 
            numero /= 10;
            numerodeDigitos++;
        }
        System.out.println("El numero de digitos es: " + numerodeDigitos);
        sc.close();
    }
}
