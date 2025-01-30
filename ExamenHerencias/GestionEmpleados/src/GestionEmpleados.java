public class GestionEmpleados {
    public static void main(String[] args) throws Exception {
        int DIMENSION = 3; //Variable constante para dar tamaño al array
        Empleado [] empleados = new Empleado[DIMENSION]; 

        empleados[0] = new Tecnico("Redes","Juan Ramirez", 32,"245fg", 1200.00, 1);
        empleados[1] = new Gestor(65000,"Ana Gonzalez",32,"yhg67",1400,4);
        empleados[2] = new Administrativo("Recursos humanos","Pedro Jimenez",34,"oppp98",2000,4);
        

        for (Empleado miempleado : empleados) {
            System.out.println(miempleado.toString());
        }
        ((CalculosLaborales)empleados[0]).calcularSalario();
        ((CalculosLaborales)empleados[0]).calcularVacaciones();
        ((CalculosLaborales)empleados[1]).calcularSalario();
        ((CalculosLaborales)empleados[1]).calcularVacaciones();  //Casteo de la interfaz para poder invocar a los metodos en el main
        ((CalculosLaborales)empleados[2]).calcularSalario();
        ((CalculosLaborales)empleados[2]).calcularVacaciones();
        

        
    }
}
