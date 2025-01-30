public abstract class Empleado {
    private String nombre;
    private int edad;
    private String idEmpleado;
    protected double salarioBase;
    protected int anosTrabajo;
    private static int totalEmpleado = 0;

    public Empleado(String nombre, int edad, String idEmpleado, double salarioBase, int anosTrabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
        this.anosTrabajo = anosTrabajo;
        totalEmpleado++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdempleado() {
        return idEmpleado;
    }

    public void setIdempleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalariobase() {
        return this.salarioBase;
    }

    public double setSalariobase(double salarioBase) {
        return this.salarioBase = salarioBase;
    }

    public int getAnostrabajo() {
        return anosTrabajo;
    }

    public void setAnostrabajo(int anosTrabajo) {
        this.anosTrabajo = anosTrabajo;
    }

    public static int getTotalempleado() {
        return totalEmpleado;
    }

    public String toString() {
        return "Empleado: " + nombre + "," + "Edad: " + edad + "," + "ID: " + idEmpleado + "," + "Salario Base: "
                + salarioBase + "," + "Años de trabajo: " + anosTrabajo;
    }
}
