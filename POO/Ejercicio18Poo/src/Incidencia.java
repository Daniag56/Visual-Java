public class Incidencia {
    private static int codIncidencia=1;
    private static int pendientes=0;
    private  int codigo;
    private int puesto;
    private String descripcion = "";
    private String estado = "pendiente";
    private String resolucion ="";

    public Incidencia(int puesto, String descripcion) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.codigo = codIncidencia++;
        pendientes++;
    }
    public void resuelve(String resolucion){
        this.resolucion = resolucion;
        this.estado = "Resuelta";
        pendientes--;
    }
    public static int  getPendientes(){
        return pendientes;
    }

    @Override
    public String toString(){
        return "Incidencia "+codigo+"-"+"Puesto:"+puesto+" - "+descripcion+" "+estado;
    }

}
