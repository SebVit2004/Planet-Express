import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Description of the class
 *
 * @author Sebastian Vitiello
 * @author
 * @version     1.0
 */
public class ListaEnvios {
    private Envio[] envios;
    private int ocupacion=0;
    /**
     * TODO: Constructor de la clase para inicializar la lista a una capacidad determinada
     *
     * @param capacidad
     */
    public ListaEnvios(int capacidad) {
		envios = new Envio[capacidad];
    }
    // TODO: Devuelve el número de envíos que hay en la lista
    public int getOcupacion() {
        return ocupacion;
    }
    // TODO: ¿Está llena la lista de envíos?
    public boolean estaLlena() {
        if (ocupacion==envios.length){
            return true;
        }
        return false;
    }
    //TODO: Devuelve el envio dado un indice
    public Envio getEnvio(int i) {
        return envios[i];
    }

    /**
     * TODO: insertamos un nuevo envío en la lista
     * @param envio
     * @return true en caso de que se añada correctamente, false en caso de lista llena o error
     */
    public boolean insertarEnvio(Envio envio) {
        if (!estaLlena()){
            envios[ocupacion]=envio;
            ocupacion++;
            return true;
        }
        return false;
    }

    /**
     * TODO: Buscamos el envio a partir del localizador pasado como parámetro
     * @param localizador
     * @return el envio que encontramos o null si no existe
     */
    public Envio buscarEnvio(String localizador) {
        for (int i=0;i<ocupacion;i++){
            if (envios[i].getLocalizador()==localizador)
                return envios[i];
        }
        return null;
    }

    /**
     * TODO: Buscamos el envio a partir del idPorte, fila y columna pasados como parámetros
     * @param idPorte
     * @param fila
     * @param columna
     * @return el envio que encontramos o null si no existe
     */
    public Envio buscarEnvio(String idPorte, int fila, int columna) {

        return null;
    }

    /**
     * TODO: Eliminamos un envio a través del localizador pasado por parámetro
     * @param localizador
     * @return True si se ha borrado correctamente, false en cualquier otro caso
     */
    public boolean eliminarEnvio (String localizador) {
        for (int i=0;i<ocupacion;i++){
            if (envios[i].getLocalizador()==localizador){
                for (int j = i; j < ocupacion; j++) {
                    envios[i - 1] = envios[i];
                }
                ocupacion--;
                return true;
            }
        }
        return false;
    }

    /**
     * TODO: Muestra por pantalla los Envios de la lista, con el formato que aparece
     * en el enunciado
     */
    public void listarEnvios() {
        for (int i=0;i<ocupacion;i++)
            System.out.println(envios[i].toString());
    }

    /**
     * TODO: Permite seleccionar un Envio existente a partir de su localizador, usando el mensaje pasado como argumento
     *  para la solicitud y siguiendo el orden y los textos mostrados en el enunciado.
     *  La función solicita repetidamente hasta que se introduzca un localizador correcto
     * @param teclado
     * @param mensaje
     * @return
     */
    public Envio seleccionarEnvio(Scanner teclado, String mensaje) {
        System.out.println(mensaje);
        String localizador = teclado.next().toUpperCase();
        for (int i=0;i<ocupacion;i++){
            if (envios[i].getLocalizador()==localizador)
                return envios[i];
        }
        return null;
    }
    /**
     * TODO: Añade los Envios al final de un fichero CSV, SIN SOBREESCRIBIR la información
     * @param fichero
     * @return
     */
    public boolean aniadirEnviosCsv(String fichero) {
        PrintWriter pw = null;
        try {
            pw =new PrintWriter(fichero);

            return true;
        } catch (Exception e) {
            return false;
        } finally {

        }
    }

    /**
     * TODO: Lee los Envios del fichero CSV y los añade a las listas de sus respectivos Portes y Clientes
     * @param ficheroEnvios
     * @param portes
     * @param clientes
     */
    public static void leerEnviosCsv(String ficheroEnvios, ListaPortes portes, ListaClientes clientes) {
        Scanner sc = null;
        try {

        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero de envíos");
        } finally {

        }
    }
}
