public class Estudiante {
    private String nombre;
    private double notas;
    private int cantidadNotas;

    public Estudiante(String nombre, double notas){
        nombre = this.nombre;
        notas = 0;
        cantidadNotas = 0;
    }

    public String getNombre(String nombre){
        return this.nombre;
    }

    public double getNotas(double notas){
        return this.notas;
    }

    public int getCantidadNotas(int cantidadNotas){
        return this.cantidadNotas;
    }

    public void setNombre(String nombre){
    }

    public void setNotas(double notas){

    }

    public void setCantidadNotas(int cantidadNotas){

    }

    public void calcularPromedio(double nota1, double nota2, double nota3){
        double promedio = (nota1 + nota2 + nota3)/3;

        if ((nota1 == 0.0) && (nota2 == 0.0) && (nota3 == 0.0)) {
            System.out.println("0.0");
        }else{
            System.out.println(promedio);
        }
    }
    @Override
    public String toString(){
        return "Estudiante[nombre = "+this.nombre+";"+"notas = "+this.notas+"promedio=";
    }
}
