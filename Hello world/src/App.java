public class App {
    public static void main(String[] args) throws Exception {
        //Colores
       System.out.println("\033[33m mandarina");
       System.out.println("\033[32m hierba");
       System.out.println("\033[31m tomate");
       System.out.println("\033[37m sábanas");
       System.out.println("\033[36m cielo");
       System.out.println("\033[35m nazareno");
       System.out.println("\033[39;49m");


       //PRINTF
       System.out.printf("El numero %d no tiene decimales. \n" , 21);
       System.out.printf("El numero %f sale con decimales. \n" , 21.0);
       System.out.printf("El numero %.3f sale exactamente con 3 decimales. \n" , 21.0);


       System.out.println("Artículo  Precio/caja  Nº cajas");
       System.out.println("----------------------------------");
       System.out.printf("%-10s %8.2f %6d\n","manzanas",4.5,10);
       System.out.printf("%-10s %8.2f %6d\n","peras",2.75,120);
       System.out.printf("%-10s %8.2f %6d\n","aguacates",10.0,6);
       
    }
}
