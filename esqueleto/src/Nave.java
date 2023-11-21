/**
 * Description of the class
 *
 * @author
 * @author
 * @version     1.0
 */
public class Nave {
    private String marca;
    private String modelo;
    private String matricula;
    private int columnas;
    private int filas;
    private double alcance;


    /**
     * Constructor of the class
     *
     * @param marca
     * @param modelo
     * @param matricula
     * @param columnas
     * @param filas
     * @param alcance
     */
    public Nave(String marca, String modelo, String matricula, int columnas, int filas, double alcance) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.columnas = columnas;
        this.filas = filas;
        this.alcance = alcance;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public int getColumnas() {
        return columnas;
    }
    public int getFilas() {
        return filas;
    }
    public double getAlcance() {
        return alcance;
    }


    /**
     * TODO: Crea un String con los datos de una nave con el siguiente formato:
     * @return ejemplo del formato -> "Planet Express One (EP-245732X): 40 contenedores, hasta 1.57 UA"
     */
    public String toString() {
        return " ";
    }


    /**
     * TODO: Crea un String con los datos de una nave con el siguiente formato:
     * @return ejemplo del formato -> "Planet Express One (EP-245732X)"
     */
    public String toStringSimple() {
        return " ";
    }
}
