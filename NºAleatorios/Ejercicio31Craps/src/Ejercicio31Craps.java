import java.util.Scanner;

public class Ejercicio31Craps {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cantidadDinero, dados = 0, sumaDados, dineroGanado = 0;

        System.out.print("Ingrese la cantidad de dinero que quiere apostar: ");
        cantidadDinero = sc.nextInt();

        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        sumaDados = dado1 + dado2;

        switch (sumaDados) {
            case 7, 11:
                dineroGanado = cantidadDinero * 2;
                System.out.println("Enhorabuena, has ganado tu cantidad de dinero es: " + dineroGanado);
                break;
            case 2, 3, 12:
                dineroGanado = 0;
                System.out.println("Lo siento, has perdido tu cantidad de dinero es: " + dineroGanado
                        + " mas suerte la proxima vez");
                break;
            case 4, 5, 6, 8, 9, 10:
                int nuevaSuma = sumaDados; 
                sumaDados = 0;
                while (sumaDados != nuevaSuma) {
                    dado1 = (int) (Math.random() * 6) + 1;
                    dado2 = (int) (Math.random() * 6) + 1;
                    sumaDados = dado1 + dado2;
                    if (sumaDados == 7) {
                        System.out.println("Lo siento has perdido, ni ganas ni pierdes dinero" + cantidadDinero);
                        sumaDados = nuevaSuma;
                    }else if (nuevaSuma == sumaDados) {
                        System.out.println("Enhorabuena has ganado, ni ganas ni pierdes dinero: "+cantidadDinero);
                        sumaDados = nuevaSuma;
                    }
                }
        }

        sc.close();
    }
}
