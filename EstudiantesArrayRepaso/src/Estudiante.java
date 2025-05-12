public class Estudiante {
    private String nombre;
    private double[] notas;
    private int cantidadNotas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new double[10];
        this.cantidadNotas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarNota(double nota) {
        if (cantidadNotas < 10) {
            notas[cantidadNotas] = nota;
            cantidadNotas++;
        } else {
            System.out.println("No se pueden agregar más notas.");
        }
    }

    public double calcularPromedio() {
        if (cantidadNotas == 0) {
            return 0.0;
        }
        double suma = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            suma += notas[i];
        }
        return suma / cantidadNotas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Estudiante[nombre=" + nombre + "; notas=");
        for (int i = 0; i < cantidadNotas; i++) {
            sb.append(notas[i]);
            if (i < cantidadNotas - 1)
                sb.append(", ");
        }
        sb.append("; promedio=").append(calcularPromedio()).append("]");
        return sb.toString();
    }
}