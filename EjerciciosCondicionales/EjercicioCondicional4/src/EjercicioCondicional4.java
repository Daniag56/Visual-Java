import java.util.Scanner;

public class EjercicioCondicional4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int horasNormales, horasTrabajadas, horasExtra;
        double sueldo;

        System.out.println("Introduzca las horas trabajadas: ");
        horasTrabajadas = sc.nextInt();

        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * 12;
            System.out.println("El sueldo semanal es de: " + sueldo);
        }else {
            horasNormales = 40 * 12;
            horasExtra = (horasTrabajadas - 40) * 16;
            sueldo = horasNormales + horasExtra;
            System.out.println("El sueldo semanal es de: " + sueldo);
        }

    }
}
