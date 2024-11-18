import java.util.Scanner;

public class Ejercicio10bucles {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double media, total = 0, numero = 0;
        int contador = 0;

        do {
            System.out.print("Introduzca numeros para realizar la media: ");
            numero = sc.nextDouble();
            if (numero >= 0) {
                total += numero;
                contador++;
            }
        } while (numero >= 0);
        media = total / contador;
        System.out.println(media);
        sc.close();
    }
}
