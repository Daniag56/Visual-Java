public class Tecnico extends Empleado implements CalculosLaborales {

    private static String especialidad;
    private double bonificacion;

    public Tecnico(String especialidad, String nombre, int edad, String idEmpleado, double salarioBase,
            int anosTrabajo) {
        super(nombre, edad, idEmpleado, salarioBase, anosTrabajo);
        this.especialidad = "";
    }
    /**
 * @author Daniel Arias Garcia
 * @param double bonificacion
 * @param String especialidad
 */
    @Override
    public double calcularBonificacion() {
        bonificacion = 0.0;
        if ((especialidad.equals("Redes"))) {
            bonificacion += 1000;
            System.out.println("Usted a obtenido: " + bonificacion + " de bonificacion");
        } else if ((especialidad.equals("Seguridad"))) {
            bonificacion += 1200;
            System.out.println("Usted a obtenido: " + bonificacion + " de bonificacion");
        } else {
            bonificacion += 800;
            System.out.println("Usted a obtenido: " + bonificacion + " de bonificacion");
        }
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
            diasVacaciones += 20;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        } else if (anosTrabajo == 2) {
            diasVacaciones += 40;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        } else if (anosTrabajo == 3) {
            diasVacaciones += 60;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        } else if (anosTrabajo == 4) {
            diasVacaciones += 80;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        }

        return diasVacaciones;

    }

    public String Tecnicoo() {
        return toString() + "," + "Especialidad: " + especialidad;
    }
}
