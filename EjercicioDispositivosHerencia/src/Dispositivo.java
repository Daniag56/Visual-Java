public abstract class Dispositivo {
    private static int contadorDisp;
    private String marca;

    public Dispositivo(String marca, int contadorDisp) {
        this.marca = marca;
        Dispositivo.contadorDisp = contadorDisp;
    }

    public static int getContadorDisp(int contadorDisp) {
        return contadorDisp;
    }

    public static String getMarca(String marca) {
        return marca;
    }

    public String toString(){
        return "Dispositivo [marca=" + marca + ", contadorDisp=" + contadorDisp + "]";
    }
}
