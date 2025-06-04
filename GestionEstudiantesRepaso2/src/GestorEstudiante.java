import java.util.Scanner;





public class GestorEstudiante {
     static int maxEstudiantes = 20;
    Estudiante estudiantes[] = new Estudiante[maxEstudiantes];
    int cantidadEstudiantes = 0;


    public GestorEstudiante() { 
        estudiantes = new Estudiante[20];
        cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(String nombre) {
      if ( cantidadEstudiantes < maxEstudiantes ) {
            if (buscarEstudiante(nombre) == null) { // Compruebo que no haya mas estudiantes con ese nombre
                System.out.println(Colours.GREEN_BRIGHT + nombre + " se une a la plantilla." + Colours.RESET);
                estudiantes[cantidadEstudiantes] = new Estudiante(nombre);
                cantidadEstudiantes++;
            } else
                System.out.println(
                        Colours.YELLOW_BRIGHT + "Lo sentimos, ya tenemos un estudiante con ese nombre." + Colours.RESET);
        } else
            System.out.println(Colours.YELLOW_BRIGHT + "No hay espacio para el alumno " + nombre + Colours.RESET);
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
      if (buscarEstudiante(nombre) != null) {
        buscarEstudiante(nombre).agregarNota(notas);
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

