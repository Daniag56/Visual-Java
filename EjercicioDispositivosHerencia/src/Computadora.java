public class Computadora extends Dispositivo implements Encendible {
    private static int ram;
    private static int procesador;
    private static int disco;
    private static boolean encendido;

    public Computadora(int ram, int procesador, int disco, boolean encendido) {
        super(null, 0);
        this.ram = ram;
        this.procesador = procesador;
        this.disco = disco;
        encendido = false;
    }
    @Override
    public void encender() {

    }
    @Override
    public void apagar() {

    }
    @Override
    public String toString() {
        super.toString();
        return "Computadora [ram=" + this.ram + ", procesador=" + this.procesador + ", disco=" + "esta encendido? "
                + encendido;
    }

}
