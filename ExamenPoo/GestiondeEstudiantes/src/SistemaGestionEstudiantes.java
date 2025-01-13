import java.util.Scanner;

public class SistemaGestionEstudiantes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        GestiondeEstudiantes gestor = new GestiondeEstudiantes();
        Estudiante e1 = new Estudiante(null, null, 0, 0);
        Estudiante e2 = new Estudiante(null, null, 0, 0);

       System.out.println("Ingrese los datos del primer estudiante: ");
       gestor.registrarEstudiante(e1);
       System.out.println("Introduzca los datos del segundo estudiante: ");
       gestor.registrarEstudiante(e2);

       gestor.mostrarEstudiante(e1);
       gestor.mostrarEstudiante(e2);

       sc.close();
    }
}
