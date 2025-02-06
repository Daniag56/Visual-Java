import java.util.ArrayList;
import java.util.HashMap;

public class ServiciosHotel {
    HashMap<String, ArrayList<String>> map = new HashMap<>();

    /**
     * @param localizacion
     * @param servicio
     */
    public void agregar(String localizacion, String servicio) {
        if (!map.containsKey(localizacion)) {
            ArrayList<String> lista = new ArrayList<>();
            lista.add(servicio);
            map.put(localizacion, lista);
        } else {
            ArrayList<String> lista = map.get(localizacion);
            if (!lista.contains(servicio)) {
                lista.add(servicio);
            }
        }
    }

    /**
     * @param localizacion
     */
    public void borrar(String localizacion) {
        if (map.containsKey(localizacion)) {
            map.remove(localizacion);
            System.out.println();
            System.out.println("\033[0;92mEntrada eliminada con exito\033[0m");
        } else {
            System.out.println();
            System.out.println("\033[0;91m!ERROR¡El hotel no se ha encontrado\033[0m");
        }
    }

    /**
     * @param localizacion
     * @param servicio
     */
    public void borrarServicio(String localizacion, String servicio) {
        if (map.containsKey(localizacion)) {
            ArrayList<String> lista = map.get(localizacion);
            if (lista.contains(servicio)) {
                lista.remove(servicio);
                System.out.println();
                System.out.println("\033[0;92mEntrada eliminada con exito\033[0m");
            }else{
                System.out.println("\033[0;91m!ERROR¡El hotel o el servicio no se ha encontrado\033[0m");
            }
        }
    }

    /**
     * @param localizacion
     */
    public void consulta(String localizacion) {
        if (map.containsKey(localizacion)) {
            ArrayList<String> lista = map.get(localizacion);
            System.out.print(localizacion + "" + lista.toString());
            System.out.println();
        } else {
            System.out.println("\033[0;91m!ERROR¡El hotel no se ha encontrado\033[0m");
        }

    }
}
