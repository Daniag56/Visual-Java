import java.util.Scanner;

public class Ejercicio10Condicional {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double horas, horasRestantes, segundos;

        System.out.print("Introduzca las horas con los minutos para calcular los segundos: ");
        horas = sc.nextDouble();

        horasRestantes = 23.59 - horas;

        if (horas<23.60) {
            segundos = horasRestantes * 3600;
            System.out.printf("Los segundos hasta media noche son: %-7.0f", segundos);
        }else{
            if (horas>23.60) {
                System.out.println("La hora introducida no es correcta");
            }
        }

    }
}
