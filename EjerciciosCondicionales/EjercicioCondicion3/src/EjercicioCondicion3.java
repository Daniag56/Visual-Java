import java.util.Scanner;

public class EjercicioCondicion3 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       int diaSemana;
       System.out.println("Introduzca un numero que corresponda a un dia de la semana: ");
       diaSemana = sc.nextInt();

       switch (diaSemana) {
        case 1 :
            diaSemana = 1;
            System.out.println("Lunes");
            break;
        case 2:
            diaSemana = 2;
            System.out.println("Martes");
            break;
        case 3:
            diaSemana = 3;
            System.out.println("Miercoles");
            break;
        case 4:
            diaSemana = 4;
            System.out.println("Jueves");
            break;
        case 5:
            diaSemana = 5;
            System.out.println("Viernes");
            break;
        case 6:
            diaSemana = 6;
            System.out.println("Sabado");
            break;
        case 7:
            diaSemana = 7;
            System.out.println("Domingo");
            break;
        default:
            System.out.println("El numero introducido no corresponde a ningun dia de la semana");
            break;
       }
    }
}
