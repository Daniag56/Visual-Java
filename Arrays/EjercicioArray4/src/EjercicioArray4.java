public class EjercicioArray4 {
    public static void main(String[] args) throws Exception {
            int[] numeros = new int[20];
            int[] cuadrado = new int[20];
            int[] cubo = new int[20];
            
            for(int i = 0; i <= 19; i++){
                numeros[i] = (int) ((Math.random() * 100) + 1);
                cuadrado[i] = numeros[i] * numeros[i];
                cubo[i] = numeros[i] * cuadrado[i];
            }
            
            for(int j = 0; j <= 19; j++){
                System.out.println(numeros[j] + " -> " + cuadrado[j] + " -> " + cubo[j]);
            }
            
          }
        }

