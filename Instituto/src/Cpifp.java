public class Cpifp implements Serializable {
    private String nombre;
    private String direccion;
    private int telefono;
    private String fichero;

    public Cpifp(String nombre, String direccion, int telefono, String fichero) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fichero = fichero;
    }

    @Override
    public String serializar(Object Estudiante) {
        return String.format("%s;%s;%d;%s", this.nombre, this.direccion, this.telefono,this.fichero);
        
    }

    @Override
    public Estudiante deserializar(String linea) {
        Estudiante est1 = new Estudiante(3345, "Juan");
        String[] datos = linea.split(";");
        this.nombre = datos[0];
        this.direccion = datos[1];
        return est1;
    }
}
