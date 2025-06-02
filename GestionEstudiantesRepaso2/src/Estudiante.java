import java.util.Arrays;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private double [] notas; // Creamos el array de esta forma ya que el enunciado nos pide que le asignemos
                         // posicion en memoria dentro del constructor
    private int cantidadNotas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        notas = new double[10]; 
        cantidadNotas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarNota(double nota) {
        if (cantidadNotas < notas.length) {
            notas[cantidadNotas] = nota;
            cantidadNotas++;
            System.out.println("Nota agregada correctamente.");
        } else {
            System.out.println("Capacidad máxima alcanzada. No se puede agregar más notas.");
        }
    }
    public double calcularPromedio() {
        int suma = 0;
        for (double n : notas) {
            System.out.println(n +" ");
            suma += n;
        }
        System.out.println("El promedio de las notas es: "+suma/cantidadNotas);
        return suma/cantidadNotas;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", notas=" + Arrays.toString(notas) + ", cantidadNotas=" + cantidadNotas
                + "]";
    }


    
}
