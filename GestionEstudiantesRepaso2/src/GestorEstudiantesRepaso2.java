import java.util.Scanner;

public class GestorEstudiantesRepaso2{
    public static void main(String[] args) throws Exception {
        int option = 1;
        String nombre;
        double promedio;
        double nota;
        Scanner sc = new Scanner(System.in);
        GestorEstudiante sistema = new GestorEstudiante();
        do {
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1. Agregar un nuevo estudiante.");
            System.out.println("2. Agregar nota a un estudiante.");
            System.out.println("3. Listar estudiantes.");
            System.out.println("4. Mostrar estudiantes con promedio mayor al indicado.");
            System.out.println("5. Buscar un estudiante por su nombre.");
            System.out.println("6. Salir.");

            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("¿Cuál es el nombre del estudiante?");
                    nombre = sc.nextLine();
                    sistema.agregarEstudiante(nombre);
                    break;

                case 2:
                    System.out.println("¿A qué estudiante desea agregarle una nota?");
                    nombre = sc.nextLine();
                    nota = Colours.introducirReal();
                    sistema.agregarNotaAEstudiante(nombre, nota);;
                    break;

                case 3:
                    sistema.mostrarEstudiante();
                    break;

                case 4:
                    promedio =  Colours.introducirReal();
                    sistema.mostrarEstudianteconPromedioMayor(promedio);
                    break;

                case 5:
                    System.out.println("¿Cuál es el nombre del estudiante?");
                    nombre = sc.nextLine();
                    System.out.println(sistema.buscarEstudiante(nombre));
                    break;

                case 6:
                    System.out.println(Colours.YELLOW_BRIGHT + "Adios!" + Colours.RESET);
                    break;

                default:

                    System.out.println("Opción fuera del rango");
                    break;
            }
            System.out.println("Pulse intro para continuar");
            sc.nextLine();
        } while (option != 6);// me aseguo de controlar cualquier valor

        sc.close();
    }
}
