public class Estudiante {
    private int id;
    private String nombre;

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String toString(){
        return "Estudiante [id=" + id + ", nombre=" + nombre + "]";
    }
}
