import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double kilometros, millas, resultadoFin;
        millas = 0.621371;
        System.out.print("Ingrese la cantidad de kilometros: ");
        kilometros = sc.nextDouble();
        resultadoFin = kilometros * millas;
        System.out.println("---------------------------------------");
        System.out.printf("Cantidad de kilometros: %-7.2f \n", kilometros);
        System.out.printf("Equivalente en millas:  \033[43m %-7.5f \033[0m \n", resultadoFin);
        System.out.println("---------------------------------------");
        System.out.println("La conversion se realizo usando la formula:");
        System.out.println("\033[41m 1km \033[0m = \033[42m 0.621371 \033[0m");
    }
}
