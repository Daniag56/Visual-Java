public class Banco{
    public static void main(String[] args) throws Exception {
        CuentaBancaria[] cuentas = new CuentaBancaria[10];


       
        cuentas[0] = new CuentaCorriente(5.0);
        cuentas[1] = new CuentaAhorro(3.0);


       
        cuentas[0].depositar(1000);
        cuentas[0].retirar(200);
        cuentas[0].calcularIntereses();
        cuentas[0].mostrarResultado();


        cuentas[1].depositar(500);
        cuentas[1].calcularIntereses();
        cuentas[1].mostrarResultado();

    }
}
