public class Coches implements Serializable {
    private String matricula;
    private String marca;
    private int añoFabricacion;

    public Coches(String matricula, String marca, int añoFabricacion) {
        this.matricula = matricula;
        this.marca = marca;
        this.añoFabricacion = añoFabricacion;
    }

    public Coches(String linea) {
        this.deserializable(linea);
    }
    @Override
    public String toString() {
        return "Matricula: " + matricula + " " + " Marca: " + marca + " Año de fabricacion: " + añoFabricacion;
    }

    @Override
    public String serialize() {
        return String.format("%s;%s;%d", this.matricula, this.marca, this.añoFabricacion);
    }

    @Override
    public void deserializable(String lineas) {
        String[] datos = lineas.split(";");
        this.matricula = datos[0];
        this.marca = datos[1];
        this.añoFabricacion = Integer.parseInt(datos[2]);
    }
}
