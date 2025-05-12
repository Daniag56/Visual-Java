import java.util.Scanner;

public class EstudiantesArrayRepaso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEstudiantes gestor = new GestorEstudiantes();
        
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar un estudiante");
            System.out.println("2. Agregar una nota a un estudiante");
            System.out.println("3. Mostrar información de todos los estudiantes");
            System.out.println("4. Mostrar estudiantes con promedio mayor a un valor");
            System.out.println("5. Buscar un estudiante por su nombre");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            
            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número entero válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del estudiante: ");
                    gestor.agregarEstudiante(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Introduce el nombre del estudiante: ");
                    String nombreNota = scanner.nextLine();
                    System.out.print("Introduce la nota: ");
                    try {
                        double nota = Double.parseDouble(scanner.nextLine());
                        gestor.agregarNotaAEstudiante(nombreNota, nota);
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, introduce un número válido.");
                    }
                    break;
                case 3:
                    gestor.mostrarEstudiantes();
                    break;
                case 4:
                    System.out.print("Introduce el promedio mínimo: ");
                    try {
                        double promedio = Double.parseDouble(scanner.nextLine());
                        gestor.mostrarEstudiantesConPromedioMayorA(promedio);
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, introduce un número válido.");
                    }
                    break;
                case 5:
                    System.out.print("Introduce el nombre del estudiante: ");
                    Estudiante estudiante = gestor.buscarEstudiante(scanner.nextLine());
                    if (estudiante != null) {
                        System.out.println(estudiante);
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    
            }
        }
    }
}
