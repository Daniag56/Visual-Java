public class GestorEstudiantes {
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    public GestorEstudiantes() {
        this.estudiantes = new Estudiante[20];
        this.cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(String nombre) {
        if (cantidadEstudiantes < 20) {
            estudiantes[cantidadEstudiantes] = new Estudiante(nombre);
            cantidadEstudiantes++;
            System.out.println("Estudiante agregado con éxito.");
        } else {
            System.out.println("No se pueden agregar más estudiantes.");
        }
    }

    public Estudiante buscarEstudiante(String nombre) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                return estudiantes[i];
            }
        }
        return null;
    }

    public void agregarNotaAEstudiante(String nombre, double nota) {
        Estudiante estudiante = buscarEstudiante(nombre);
        if (estudiante != null) {
            estudiante.agregarNota(nota);
            System.out.println("Nota agregada con éxito.");
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public void mostrarEstudiantes() {
        if (cantidadEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println(estudiantes[i]);
        }
    }

    public void mostrarEstudiantesConPromedioMayorA(double promedio) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].calcularPromedio() > promedio) {
                System.out.println(estudiantes[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay estudiantes con promedio mayor a " + promedio);
        }
    }
}
