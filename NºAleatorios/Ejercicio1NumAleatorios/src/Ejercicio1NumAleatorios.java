public class Ejercicio1NumAleatorios {
    public static void main(String[] args) throws Exception {
        int suma = 0;
        int  random;
        for (int i = 1; i < 4; i++) {
            System.out.println(random = (int)(Math.random()*6)+1);
            suma += random;
        }
        System.out.println("La suma de los numero es: "+suma);
    }
}

