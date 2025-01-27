import java.util.Scanner;

public class GestionBanco{
    private int opcion;
    CuentaBancaria[] cuentas = new CuentaBancaria[10];
    CuentaBancaria gestion;
    private double cantidad;
    public void menuGestion() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Bienvenido a la gestion de banco-----");
        System.out.println("1.                  Crear cuenta");
        System.out.println("2.                  Depositar");
        System.out.println("3.                  Retirar");
        System.out.println("4.                  Consultar");
        System.out.println("5.                  Dar de baja");
        System.out.println("6.                  Salir");
        System.out.println("---------Ingrese una opcion para interactuar----");
        opcion = sc.nextInt();


        switch (opcion) {
            case 1:
                
            case 2:
               gestion.depositar(cantidad);
                break;
            case 3:
               gestion.retirar(cantidad);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        sc.close();
    }

    public void Controlador(int opcion) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        try {
            if ((opcion > 6)) {
                System.out.println("No existe esa opcion");
            }
            sc.nextInt();
            bandera = false;
        } catch (Exception e) {
            System.out.println("Ingrese una opcion valida");
        }
        sc.close();
    }

}
