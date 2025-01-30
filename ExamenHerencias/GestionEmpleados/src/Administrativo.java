public class Administrativo extends Empleado implements CalculosLaborales {
    private static String area;
    private double bonificacion;
    private int TAREA = 30; //Constante

    public Administrativo(String area, String nombre, int edad, String idEmpleado, double salarioBase,
            int anosTrabajo) {
        super(nombre, edad, idEmpleado, salarioBase, anosTrabajo);
        area = "";
    }
/**
 * @author Daniel Arias Garcia
 * @param double bonificacion
 * @param int TAREA
 */
    @Override
    public double calcularBonificacion() {
        bonificacion = 0.0;
        if (area.equals("Recursos humanos")) {
            bonificacion = 20 * TAREA;
            System.out.println("Su bonificacion es: " + bonificacion + " de bonificacion");
        } else {
            bonificacion = 10 * TAREA;
            System.out.println("Su bonificacion es: " + bonificacion + " de bonificacion");
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
            diasVacaciones += 15;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        } else if (anosTrabajo == 2) {
            diasVacaciones += 30;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        } else if (anosTrabajo == 3) {
            diasVacaciones += 45;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        } else if (anosTrabajo == 4) {
            diasVacaciones += 55;
            System.out.println("Sus vacaciones son: " + diasVacaciones);
        }

        return diasVacaciones;

    }

    public String Administrativoo() {
        return toString() + "," + "Area: " + area;
    }
}
