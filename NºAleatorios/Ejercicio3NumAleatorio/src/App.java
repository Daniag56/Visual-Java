public class App {
    public static void main(String[] args) throws Exception {
        String palos="";
        String cartas="";

      int numeroPalo =(int)(Math.random()*4)+1;
     

      switch (numeroPalo) {
        case 1:
            palos = "Oro";
            break;
        case 2:
            palos = "Basto";
            break;
        case 3:
            palos = "Espada";
            break;
        case 4:
            palos = "Tréboles";
            break;
      }
      int numeroCarta = (int)(Math.random()*40)+1;

     switch (numeroCarta) {
        case 1:
            cartas ="As";
            break;
        case 11:
            cartas ="rey";
            break;
        case 12:
            cartas ="caballo";
            break;
        case 13:
            cartas ="sota";
            break;
        default:
            cartas = String.valueOf(numeroCarta);
            break;
     }
     System.out.println("A salido la carta "+cartas+" del palo "+palos);
    }
}
