public class Coches implements Serializable{
    private String matricula;
    private String marca;
    private int añoFabricacion;

    public void Coche(String matricula,String marca,int añoFabricacion){
        this.matricula = matricula;
        this.marca = marca;
        this.añoFabricacion = añoFabricacion;
    }
    @Override
    public void serialize(){

    }
    @Override
    public  void deserializable(){

    }

    public String toString(){
        return "Matricula: " + matricula + " " + " Marca: " + marca + " Año de fabricacion: " + añoFabricacion;
    }
}
