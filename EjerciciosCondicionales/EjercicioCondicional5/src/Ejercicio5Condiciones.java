import java.util.Scanner;

public class Ejercicio5Condiciones {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Introduzca el valor de a: ");
        a = sc.nextInt();
        System.out.print("Ahora introduzca el valor de b: ");
        b = sc.nextInt();


        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        } else {
            double x = -b / a;
            System.out.println("La solución de la ecuación es: x = " + x);
        }
    }
}
