public class TarjetaRegalo {
    private String id = " ";
    private double saldoIn;

    public TarjetaRegalo(double saldoIn) {
        this.saldoIn = saldoIn;
        this.id = generarId();
    }
    public void setsaldoIn(double saldoIn){
        this.saldoIn=saldoIn;
    }
    public double getsaldoIn(){
        return saldoIn;
    }
    public TarjetaRegalo fusionarCon(TarjetaRegalo tarjetaFusionada) {
        double nuevoSaldo = this.getsaldoIn() + tarjetaFusionada.getsaldoIn();
        this.setsaldoIn(0);
        tarjetaFusionada.setsaldoIn(0);
        return new TarjetaRegalo(nuevoSaldo);
    }

    public void gasta(double cantidad) {
        if (cantidad <= this.saldoIn) {
            this.saldoIn -= cantidad;
        } else {
            System.out.println("No tienes suficiente saldo");
        }
    }

    private String generarId() {
        for (int i = 0; i < 4; i++) {
            this.id += (int) (Math.random() * 10);
        }
        return id;
    }

    public String toString() {
        return "Tarjeta nº " + id + " - " + "Saldo: " + saldoIn;
    }
}
