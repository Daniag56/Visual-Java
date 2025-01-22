import java.util.Scanner;

public class GestorEstudiantes {
    Scanner sc = new Scanner(System.in);
    int cantidadEstudiantes = 0;
     Estudiante [] estudiantes = new Estudiante [3];
/**
 * @param String nombre
 * @param double nota
 * 
 */
    public void agregarEstudiante(){
       
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese las notas del estudiante: ");
        double nota1 = sc.nextDouble();
        Estudiante est1 = new Estudiante(nombre, nota1);
        estudiantes[3] = est1;
    }
    public void mostarEstudiante(){
        for (Estudiante misEstudiantes : estudiantes) {
            System.out.println(misEstudiantes.toString()); //for al estilo foreach para imprimir el array
       }
    }
}
