public class Televisor extends Dispositivo implements Encendible{
    
    private int diagonal;
    private String tecnologia;
    private boolean encendido;
    public Televisor(int diagonal, String tecnologia, boolean encendido) {
        super(null, 0);
        this.diagonal = diagonal;
        this.tecnologia = tecnologia;
        encendido = false;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el televisor");
        encendido = true;

    }
    @Override
    public void apagar() {
        System.out.println("Apagando el televisor");
        encendido = false;
    }
    @Override
    public String toString(){
        super.toString();
        return "Diagonal: " + this.diagonal + "cm, Tecnologia: " + this.tecnologia +"esta encendido?"+encendido;
    }
}
