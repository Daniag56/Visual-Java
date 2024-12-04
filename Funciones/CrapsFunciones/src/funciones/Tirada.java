package funciones;

public class Tirada {
    //Funciones///
    /**
     * Devuelve la tirada de dos dados, dos numeros aleatorios
     * @return
     */
    public static int lanzaDados(){
    
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        return dado1;
    }
}
