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
        String nombreEstudiante = sc.nextLine();
        Estudiante estudiante1 = new Estudiante(nombre);
        estudiantes[cantidadEstudiantes] = estudiante1;
        sc.close();
    }

    public Estudiante buscarEstudiante(String nombre) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                return(estudiantes[i]);
            }
        }
        return null;
    }
    
    public void agregarNotaAEstudiante(String nombre, double notas) {
       for(int i = 0; i< cantidadEstudiantes; i++) {
        if (estudiantes[i] != null && estudiantes[i].getNombre().equals(nombre)) {
            System.out.println("Estudiante encontrado: "+estudiantes[i].getNombre());
        }else{
            System.out.println("Estudiante no encontrado");
        }
       }
    }

    public void mostrarEstudiante(){
        if (cantidadEstudiantes > 0) {
            for (int i = 0; i < cantidadEstudiantes; i++) {
                System.out.println(estudiantes[i]);
            }
        }else{
            System.out.println("No hay estudiantes registrados");
        }
    }

    public void mostrarEstudianteconPromedioMayor(double promedio){
        System.out.println("Estos son los estudiantes con un promedio mayor a " + promedio + ":");
        int cantidad = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].calcularPromedio() > promedio) { // mayor estricto
                System.out.println(estudiantes[i]);
                cantidad++;
            }
        }
        if (cantidad == 0)
            System.out.println(Colours.YELLOW_BRIGHT + "Ningun estudiante supera ese promedio" + Colours.RESET);
    }
    }

