import java.util.Scanner;

public class GestorEstudiante {
    private Estudiante[]estudiantes;
    private int cantidadEstudiantes;


    public GestorEstudiante() { 
        estudiantes = new Estudiante[20];
        cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante");
        String nombreEstudiante = sc.nextLine();
        Estudiante estudiante1 = new Estudiante(nombre);
        estudiantes[cantidadEstudiantes] = estudiante1;
        sc.close();
    }

    public void buscarEstudiante(String nombre) {
        
    }
    
    public void agregarNotaAEstudiante(String nombre, double notas) {

    }

    public void mostrarEstudiante(){

    }

    public void mostrarEstudianteconPromedioMayor(double promedio){

    }
}
