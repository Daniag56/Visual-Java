public class Ejercicio1Bucles {
    public static void main(String[] args) throws Exception {

        for (int multiplos = 0; multiplos <= 100; multiplos++) {
            if (multiplos % 5 == 0) {
                System.out.println("Los multiplos de 5 son: " + multiplos);
            }
        }
    }
}
