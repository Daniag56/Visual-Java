import java.util.Scanner;

public class EjercicioCondicion1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

      String asignatura, diaSemana;
        System.out.println("Introduzca el dia de la semana: ");
        diaSemana = sc.nextLine();

        switch (diaSemana) {
            case "Lunes":
                asignatura = "Entornos";
                System.out.println("La asignatura que toca ese dia es: "+ asignatura);
                break;
            case "Martes":
                asignatura = "Sostenibilidad";
                System.out.println("La asignatura que toca ese dia es: "+ asignatura);
                break;
            case "Miercoles":
                asignatura = "Lenguaje de marcas";
                System.out.println("La asignatura que toca ese dia es: "+ asignatura);
                break;
            case "Jueves":
                asignatura = "Programacion";
                System.out.println("La asignatura que toca ese dia es: "+ asignatura);
                break;
            case "Viernes":
                asignatura = "Base de datos";
                System.out.println("La asignatura que toca ese dia es: "+ asignatura);
                break;
            case "Sabado","Domingo":
                System.out.println("Ese dia no hay clase");
                break;
            default:
                System.out.println("No existe ese dia de la semana");
                break;
        }
    }
}
