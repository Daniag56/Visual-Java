public class Computadora extends Dispositivo implements Encendible {
    private int ram;
    private int procesador;
    private int disco;
    private String programa="";
    private boolean encendido;

    public Computadora(int ram, int procesador, int disco,String marca, boolean encendido) {
        super(null);
        this.ram = ram;
        this.procesador = procesador;
        this.disco = disco;
        encendido = false;
    }
    @Override
    public void encender() {
        System.out.println("Encendiendo el televisor");
        encendido = true;
        programa = "notepad";

    }
    @Override
    public void apagar() {
        System.out.println("Apagando el televisor");
        encendido = false;
        programa = "";
    }
    @Override
    public String toString() {
        return "Computadora [ram="+ this.ram +", marca=" +this.marca +  ", procesador=" + this.procesador + ", disco=" + "esta encendido? "
                + encendido;
    }

}
