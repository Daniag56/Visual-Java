public class GestiondeEstudiantes {

    public void registrarEstudiante(Estudiante e1) {
        String matricula, nombre;
        int edad;
        double promedio;

        matricula = e1.pedirMatricula();
        nombre = e1.pedirNombre();
        edad = e1.pedirEdad();
        promedio = e1.pedirPromedio();

        Estudiante estudiante1 = new Estudiante(matricula, nombre, edad, promedio);
    }

    public void mostrarEstudiante(Estudiante e1) {
        System.out.println(e1.toString());

    }
}
