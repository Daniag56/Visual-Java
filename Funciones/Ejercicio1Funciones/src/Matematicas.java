public class Matematicas {
    public static void main(String[] args) {
    }

    public static boolean esCapicua(int num, int numReves) {
        while (num > 0) {
            numReves = (numReves * 10) + (num % 10);
            num /= 10;
        }
        return (numReves == num); // Si se cumple la condición, devolvera un true, si la condicion no se cumple
                                  // devolvera un false
    }

    public static boolean esPrimo(int num1) {
        if (num1 < 2) {
            return false;
        } else {
            for (long i = num1 / 2; i >= 2; i--) {
                if (num1 % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static int siguientePrimo(int num1) {
        
        return num1;
    }

}
