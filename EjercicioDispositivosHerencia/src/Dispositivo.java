public abstract class Dispositivo {
    private static int contadorDisp = 0;
    protected String marca;

    public Dispositivo(String marca) {
        this.marca = marca;
        contadorDisp++;
    }

    public static int getContadorDisp() {
        return contadorDisp;
    }

    public int setContadorDisp(int contadorDisp) {
        return contadorDisp++;
    }

    public String toString() {
        return "Dispositivo [marca=" + marca + "]";
    }
}
