import java.util.Scanner;

public class SistemaGestorEstudiantes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
        GestorEstudiantes gestor =  new GestorEstudiantes();
        System.out.println("Introduzca la opcion con la que desea interactuar: ");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Agregar nota a estudiante");
        System.out.println("3. Mostrar informacion sobre los estudiantes");
        System.out.println("4. Mostrar estudiantes con promedio mayor");
        System.out.println("5. Buscar estudiantes por su nombre");
        System.out.println("6. Salir");
        System.out.println("------------------------------------------------------");
        System.out.println(" ");
        
        opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    gestor.agregarEstudiante();
                    break;
                case 2:
                    break;
                case 3:
                    gestor.mostarEstudiante();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Gracias por usarme, adios!");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 6);
        sc.close();
    }
}
