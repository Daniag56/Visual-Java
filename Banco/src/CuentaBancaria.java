public abstract class CuentaBancaria implements Operaciones{
    protected double saldo;
    protected double interes;

    public CuentaBancaria() {
        this.saldo = 0.0;
    }

    public void depositar(double cantidad){
        this.saldo += cantidad;
        System.out.println("Usted a depositado: "+cantidad);
    }
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado: " + cantidad);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    @Override
    public void calcularIntereses() {
        double interesesGanados = saldo * interes / 100;
        depositar(interesesGanados);
        System.out.println("Intereses calculados y añadidos: " + interesesGanados);
    }


    @Override
    public void mostrarResultado() {
        System.out.println(obtenerSaldo());
    }


    public String obtenerSaldo() {
        return "El saldo actual es: " + saldo;
    }
}


