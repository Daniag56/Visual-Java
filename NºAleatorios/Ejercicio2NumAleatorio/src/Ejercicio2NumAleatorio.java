public class  Ejercicio2NumAleatorio{
    public static void main(String[] args) throws Exception {
        String palos="";
        String cartas="";

      int numeroPalo =(int)(Math.random()*4)+1;
     


      switch (numeroPalo) {
        case 1:
            palos = "Picas";
            break;
        case 2:
            palos = "Corazones";
            break;
        case 3:
            palos = "Diamantes";
            break;
        case 4:
            palos = "Tréboles";
            break;
      }
      int numeroCarta = (int)(Math.random()*13)+1;

     switch (numeroCarta) {
        case 1:
            cartas ="A";
            break;
        case 11:
            cartas ="J";
            break;
        case 12:
            cartas ="Q";
            break;
        case 13:
            cartas ="K";
            break;
        default:
            cartas = String.valueOf(numeroCarta);
            break;
     }
     System.out.println("A salido la carta "+cartas+" del palo "+palos);
    }
}