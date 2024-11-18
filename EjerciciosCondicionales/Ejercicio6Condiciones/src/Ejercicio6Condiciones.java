import java.util.Scanner;

public class Ejercicio6Condiciones {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);


        final double g = 9.81;
       
         System.out.print("Ingrese la altura desde la que cae el objeto (en metros): ");
         double h = sc.nextDouble();


         if (h < 0) {
             System.out.println("La altura no puede ser negativa.");
         } else {
             double t = Math.sqrt((2 * h) / g);
             System.out.println("El tiempo de caída es: " + t + " segundos.");
         }

    }
}
