public class Gestor extends Empleado implements CalculosLaborales {
    private static double presupuesto;
    private double bonificacion;

    public Gestor(double presupuesto, String nombre, int edad, String idEmpleado, double salarioBase, int anosTrabajo) {
        super(nombre, edad, idEmpleado, salarioBase, anosTrabajo);
        presupuesto = 0.0;
    }
/**
 * @author Daniel Arias Garcia
 * @param double bonificacion
 * @param double presupuesto
 */
    @Override
    public double calcularBonificacion() {
        bonificacion = presupuesto / 0.05;
        System.out.println("Su bonificacion es: " + bonificacion);
        return bonificacion;
    }
/**
 * @author Daniel Arias Garcia
 * @param double bonificacion
 * @param double total
 */
    @Override
    public double calcularSalario() {
        double total = 0.0;
        total = salarioBase + bonificacion;
        System.out.println("Su salario total con la bonificacion es de: " + total);
        return total;
    }
/**
 * @author Daniel Arias Garcia
 * @param int diasVacaciones
 */
    @Override
    public int calcularVacaciones() {
        int diasVacaciones = 0;
        if (anosTrabajo == 1) {
            diasVacaciones += 30;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        } else if (anosTrabajo == 2) {
            diasVacaciones += 60;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        } else if (anosTrabajo == 3) {
            diasVacaciones += 90;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        } else if (anosTrabajo == 4) {
            diasVacaciones += 120;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        }

        return diasVacaciones;

    }

    public String Gestoor() {
        return toString() + "," + "Presupuesto: " + presupuesto;
    }
}
