public class Coches implements Serializable{
    private String matricula;
    private String marca;
    private int añoFabricacion;

    public void Coche(String matricula,String marca,int añoFabricacion){
        this.matricula = matricula;
        this.marca = marca;
        this.añoFabricacion = añoFabricacion;
    }
   

    public String toString(){
        return "Matricula: " + matricula + " " + " Marca: " + marca + " Año de fabricacion: " + añoFabricacion;
    }


    @Override
    public String serialize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'serialize'");
    }


    @Override
    public void deserializable(String datos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deserializable'");
    }
}
