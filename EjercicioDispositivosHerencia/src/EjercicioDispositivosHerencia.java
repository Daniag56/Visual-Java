public class EjercicioDispositivosHerencia {
    public static void main(String[] args) throws Exception {
        int MAX = 10;
        Dispositivo [] miDisp = new Dispositivo[MAX];

        miDisp[0] = new Computadora(12, 3, 500, "toshiba", false);
        miDisp[1] = new Computadora(16, 2, 1000, "Asus", false);
        miDisp[2] = new Televisor(25, "oled","sony", false);
        miDisp[3] = new Televisor(50, "hd","lg", false);
        
        for(int i = 0; i< Dispositivo.getContadorDisp();i++){
            System.out.println(miDisp[i]);
            ((Encendible)miDisp[i]).encender();
        }
        
    }
}
