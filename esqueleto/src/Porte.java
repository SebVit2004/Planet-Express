import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * Description of the class
 *
 * @author
 * @author
 * @version     1.0
 */
public class Porte {
    private boolean[][] huecos;
    private String id;
    private Nave nave;
    private PuertoEspacial origen;
    private int muelleOrigen;
    private Fecha salida;
    private PuertoEspacial destino;
    private int muelleDestino;
    private Fecha llegada;
    private double precio;
    private ListaEnvios listaEnvios;

    /**
     * TODO: Completa el constructo de la clase
     * 
     * @param id
     * @param nave
     * @param origen
     * @param muelleOrigen
     * @param salida
     * @param destino
     * @param muelleDestino
     * @param llegada
     * @param precio
     */
    public Porte(String id, Nave nave, PuertoEspacial origen, int muelleOrigen, Fecha salida, PuertoEspacial destino, int muelleDestino, Fecha llegada, double precio) {

    }
    public String getID() {
        return id;
    }
    public Nave getNave(){
        return nave;
    }
    public PuertoEspacial getOrigen() {
        return origen;
    }
    public int getMuelleOrigen() {
        return muelleOrigen;
    }
    public Fecha getSalida(){
        return salida;
    }
    public PuertoEspacial getDestino() {
        return destino;
    }
    public int getMuelleDestino() {
        return muelleDestino;
    }
    public Fecha getLlegada() {
        return llegada;
    }
    public double getPrecio() {
        return precio;
    }
    // TODO: Devuelve el número de huecos libres que hay en el porte
    public int numHuecosLibres() {

    }
    // TODO: ¿Están llenos todos los huecos?
    public boolean porteLleno() {

    }
    // TODO: ¿Está ocupado el hueco consultado?
    public boolean huecoOcupado(int fila, int columna) {

    }
    public Envio buscarEnvio(String localizador) {
        return listaEnvios.buscarEnvio(localizador);
    }


    /**
     * TODO: Devuelve el objeto Envio que corresponde con una fila o columna,
     * @param fila
     * @param columna
     * @return el objeto Envio que corresponde, o null si está libre o se excede en el límite de fila y columna
     */
    public Envio buscarEnvio(int fila, int columna) {

        return null;
    }


    /**
     * TODO: Método que Si está desocupado el hueco que indica el envio, lo pone ocupado y devuelve true,
     *  si no devuelve false
     * @param envio
     * @return
     */
    public boolean ocuparHueco(Envio envio) {

        return false;
    }


    /**
     * TODO: A través del localizador del envio, se desocupará el hueco
     * @param localizador
     * @return
     */
    public boolean desocuparHueco(String localizador) {

        return false;
    }

    /**
     * TODO: Devuelve una cadena con información completa del porte
     * @return ejemplo del formato -> "Porte PM0066 de Gaia Galactic Terminal(GGT) M5 (01/01/2023 08:15:00) a
     *  Cidonia(CID) M1 (01/01/2024 11:00:05) en Planet Express One(EP-245732X) por 13424,56 SSD, huecos libres: 10"
     */
    public String toString() {
        return "Porte "+id+" de "+origen+" "+salida.toString()+" a "+destino+" "+llegada.toString();
    }


    /**
     * TODO: Devuelve una cadena con información abreviada del vuelo
     * @return ejemplo del formato -> "Porte PM0066 de GGT M5 (01/01/2023 08:15:00) a CID M1 (01/01/2024 11:00:05)"
     */
    public String toStringSimple() {
        return "Porte "+id+" de "+origen+" "+salida.toString()+" a "+destino+" "+llegada.toString();
    }


    /**
     * TODO: Devuelve true si el código origen, destino y fecha son los mismos que el porte
     * @param codigoOrigen
     * @param codigoDestino
     * @param fecha
     * @return
     */
    public boolean coincide(String codigoOrigen, String codigoDestino, Fecha fecha) {
        return ;
    }


    /**
     * TODO: Muestra la matriz de huecos del porte, ejemplo:
     *        A  B  C
     *      1[ ][ ][ ]
     *      2[X][X][X]
     *      3[ ][ ][ ]
     *      4[ ][X][ ]
     *     10[ ][ ][ ]
     */
    public void imprimirMatrizHuecos() {
        System.out.print("  ");

    }

    /**
     * TODO: Devuelve true si ha podido escribir en un fichero la lista de envíos del porte, siguiendo las indicaciones
     *  del enunciado
     * @param fichero
     * @return
     */
    public boolean generarListaEnvios(String fichero) {
        PrintWriter pw = null;
        try {

            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }


    /**
     * TODO: Genera un ID de porte. Este consistirá en una cadena de 6 caracteres, de los cuales los dos primeros
     *  serán PM y los 4 siguientes serán números aleatorios.
     *  NOTA: Usar el objeto rand pasado como argumento para la parte aleatoria.
     * @param rand
     * @return ejemplo -> "PM0123"
     */
    public String generarID(Random rand) {
        return "PM"+ (rand);
    }

    /**
     * TODO: Crea y devuelve un objeto Porte de los datos que selecciona el usuario de puertos espaciales
     *  y naves y la restricción de que no puede estar repetido el identificador, siguiendo las indicaciones
     *  del enunciado.
     *  La función solicita repetidamente los parametros hasta que sean correctos
     * @param teclado
     * @param rand
     * @param puertosEspaciales
     * @param naves
     * @param portes
     * @return
     */
    public Porte altaPorte(Scanner teclado, Random rand, ListaPuertosEspaciales puertosEspaciales, ListaNaves naves, ListaPortes portes) {
        Scanner sc = new Scanner(System.in);
        String id;
        Nave nave1;
        PuertoEspacial origen = null;
        int muelleOrigen;
        Fecha salida;
        PuertoEspacial destino = null;
        int muelleDestino;
        Fecha llegada;
        double precio;
        boolean cont=false;
        do {
            String codigoPuertoOrigen = Utilidades.leerCadena(sc, "Ingrese código de puerto Origen: ");
            
            if (puertosEspaciales.buscarPuertoEspacial(codigoPuertoOrigen)!=null){
                origen=puertosEspaciales.buscarPuertoEspacial(codigoPuertoOrigen);
                cont=true;
            } else if (codigoPuertoOrigen.equalsIgnoreCase("cancelar")) {
                return null;
            } else
                System.out.println("Código de puerto no encontrado.");
        }while (!cont);
        muelleOrigen = Utilidades.leerNumero(sc, "Ingrese el muelle de Origen (1 - "+origen.getMuelles()+"):", 1, origen.getMuelles());

        cont = false;
        do {
            String codigoPuertoDestino = Utilidades.leerCadena(sc, "Ingrese código de puerto Destino: ");
            if (puertosEspaciales.buscarPuertoEspacial(codigoPuertoDestino)!=null){
                cont=true;
                destino=puertosEspaciales.buscarPuertoEspacial(codigoPuertoDestino);
            }else if (codigoPuertoDestino.equalsIgnoreCase("cancelar")) {
                return null;
            }else {
                System.out.println("Código de puerto no encontrado.");
            }
        }while (!cont);
        muelleDestino = Utilidades.leerNumero(sc, "Ingrese el Terminal Destino (1 - "+destino.getMuelles()+"):", 1, destino.getMuelles());
        if (muelleDestino<1)
            return null;

        naves.mostrarNaves();
        nave1 = naves.seleccionarNave(sc, "Ingrese matrícula de la nave: ", origen.distancia(destino));
        if (nave1==null)
            return null;

        cont = false;
        do {
            salida=Utilidades.leerFechaHora(sc, "Introduzca la fecha de salida");
            if (salida == null)
                return null;
            llegada=Utilidades.leerFechaHora(sc, "Introduzca la fecha de llegada");
            if (llegada == null)
                return null;
            if(salida.anterior(llegada))
                cont=true;
            else
                System.out.println("Llegada debe ser posterior a salida.");
        }while (!cont);

        precio = Utilidades.leerNumero(sc, "",0.0,99999999);
        if (precio<0)
            return null;
        id = generarID(rand);
        return new Porte(id, nave1, origen, muelleOrigen, salida, destino, muelleDestino, llegada, precio);
    }
}