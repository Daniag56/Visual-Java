import java.util.Scanner;

public class Estudiante {
    private String matricula;
    private String nombre;
    private int edad;
    private double promedio;
    Scanner sc = new Scanner(System.in);
   
    public Estudiante(String matricula, String nombre, int edad, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public void setMatricula() {

    }

    public void setNombre() {

    }

    public void setEdad() {
        if (!(edad >= 0) && !(edad <= 120)) {
            this.edad = 0;
        }
    }

    public void setPromedio() {
        if ((promedio >= 0.0) && (promedio <= 10.0)) {
            this.promedio = 0.0;
        }
    }

    public String pedirMatricula() {
        System.out.println("Introduce la matricula: ");
        matricula = sc.nextLine();
        return matricula;
    }
    public String pedirNombre(){
        System.out.println("Introduce el nombre: ");
        nombre = sc.nextLine();
        return nombre;
    }

    public int pedirEdad(){
        System.out.println("Introduce la edad: ");
        edad = sc.nextInt();
        return edad;
    }
    public double pedirPromedio(){
        System.out.println("Introduce el promedio: ");
        promedio = sc.nextDouble();
        return promedio;
    }
    @Override
    public String toString() {
        return "Estudiante[matricula=" + matricula + "," + "nombre=" + nombre + "," + "edad=" + edad + "," + "promedio="
                + promedio;
    }
}
