import java.util.Scanner;

public class Ejercicio13Condicional {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int num1;

        System.out.print("Introduzca un numero por teclado: ");
        num1 = sc.nextInt();

        if ((num1 % 5 == 0)) {
            System.out.println("El numero"+" "+ num1 +" "+"es divisible entre 5");
        }else{
            System.out.println("El numero"+" "+ num1 +" "+"no es divisible entre 5");
        }if ((num1 % 10 == 0)) {
            System.out.println("El numero"+" "+ num1 +" "+"es par");
        }else{
            System.out.println("El numero"+" "+ num1 +" "+"no es par");
        }
        sc.close();
    }
}
