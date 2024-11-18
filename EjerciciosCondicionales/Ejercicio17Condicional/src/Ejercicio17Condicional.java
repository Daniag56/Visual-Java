import java.util.Scanner;

public class Ejercicio17Condicional {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduzca el numero: ");
        numero = sc.nextInt();
        if (numero == numero) {
            numero = numero % 10;
            System.out.println("La ultima cifra del numero son: "+ numero);
        }else{
            System.out.println("Introduzca correctamente un numero");
        }
        sc.close();
    }
}
