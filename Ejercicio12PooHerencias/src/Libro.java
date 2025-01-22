public class Libro  extends Publicacion implements Prestable{

    
    private String prestado;
    public Libro(String ISBN, String titulo, int anoPublicacion) {
        super(ISBN,titulo,anoPublicacion);
        this.prestado = "No prestado";
    }
    
    @Override
    public void presta(){
        if (prestado != "prestado") {
            prestado = "prestado";
        }
    }
    @Override
    public void devuelve(){
        if (prestado == "prestado") {
            prestado = "No prestado";
        }
    }
    @Override
    public boolean estaPrestado(){
        return prestado.equals("prestado");
    }


    public String toString(){
        return super.toString() + " " + prestado;
    }
}
