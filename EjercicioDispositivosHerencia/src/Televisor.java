public class Televisor extends Dispositivo implements Encendible{
    
    private int diagonal;
    private String tecnologia;
    private boolean encendido;
    private String canal = "";
    public Televisor(int diagonal, String tecnologia,String marca, boolean encendido) {
        super(null);
        this.diagonal = diagonal;
        this.tecnologia = tecnologia;
        encendido = false;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el televisor");
        encendido = true;
        canal = "canal 2";
    }
    @Override
    public void apagar() {
        System.out.println("Apagando el televisor");
        encendido = false;
        canal = " ";
    }
    @Override
    public String toString(){
        return "Diagonal: " + this.diagonal + "cm, Tecnologia: " + this.tecnologia+"marca:"+this.marca +"esta encendido?"+encendido;
    }
}
