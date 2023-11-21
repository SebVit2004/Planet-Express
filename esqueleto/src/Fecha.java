/**
 * Fecha es una clase que encapsula las variables enteras
 * usadas para definir una fecha de un día concreto, así
 * como también la hora. Se recomienda utilizar esta clase
 * para definir eventos temporales concretos, como la
 * salida o llegada de un vuelo.
 *
 * @author Cristian Ramírez Atencia
 * @version 1.0
 */
public class Fecha {
    /**
     * Meses del año.
     */
    enum Meses { ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE }
    /**
     * Primer año para fecha válida.
     */
    public static final int PRIMER_ANIO = 1900;
    /**
     * Último año para fecha válida.
     */
    public static final int ULTIMO_ANIO = 3000;
    /**
     * Número de meses del año.
     */
    public static final int MESES_ANIO = 12;
    /**
     * Número de días del mes.
     */
    public static final int DIAS_MES = 31;
    /**
     * Número de días de febrero.
     */
    public static final int DIAS_FEBRERO = 28;
    /**
     * Número de horas del día.
     */
    public static final int HORAS_DIA = 24;
    /**
     * Número de minutos en una hora.
     */
    public static final int MINUTOS_HORA = 60;
    /**
     * Número de segundos en un minuto.
     */
    public static final int SEGUNDOS_MINUTO = 60;

    /**
     * Día del evento.
     * Valor entre 1 y 31.
     */
    private int dia;
    /**
     * Mes del evento.
     * Valor entre 1 y 12.
     */
    private int mes;
    /**
     * Año del evento.
     * Valor superior a 1900.
     */
    private int anio;
    /**
     * Hora del evento.
     * Valor entre 0 y 23.
     */
    private int hora;
    /**
     * Minuto del evento.
     * Valor entre 0 y 59.
     */
    private int minuto;
    /**
     * Segundo del evento.
     * Valor entre 0 y 59.
     */
    private int segundo;

    /**
     * Constructor de la clase Fecha usado para definir
     * únicamente la fecha, pero no la hora del evento.
     *
     * @param dia Dia del evento
     * @param mes Mes del evento
     * @param anio Año del evento
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        hora = -1;
        minuto = -1;
        segundo = -1;
    }

    /**
     * Constructor de la clase Fecha usado para definir
     * fecha y hora de un evento.
     *
     * @param dia Dia del evento
     * @param mes Mes del evento
     * @param anio Año del evento
     * @param hora Hora del evento
     * @param minuto Minutos del evento
     * @param segundo Segundos del evento
     */
    public Fecha(int dia, int mes, int anio, int hora, int minuto, int segundo) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /**
     * Getter del atributo dia.
     *
     * @return Dia del evento
     */
    public int getDia(){
        return dia;
    }

    /**
     * Getter del atributo mes.
     *
     * @return Mes del evento
     */
    public int getMes(){
        return mes;
    }

    /**
     * Getter del atributo año.
     *
     * @return Año del evento
     */
    public int getAnio(){
        return anio;
    }

    /**
     * Getter del atributo hora.
     *
     * @return Hora del evento
     */
    public int getHora() {
        return hora;
    }

    /**
     * Getter del atributo minuto.
     *
     * @return Minutos del evento
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Getter del atributo segundo.
     *
     * @return Segundos del evento
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Retorna una cadena de texto con la fecha y hora del evento.
     *
     * @return Cadena de texto con la fecha formateada
     */
    public String toString() {
        String evento;
        //Eventos sin hora
        if (hora < 0)
            evento = String.format("%02d/%02d/%04d", dia, mes, anio);
        //Eventos con hora
        else
            evento = String.format("%02d/%02d/%04d %02d:%02d:%02d", dia, mes, anio, hora, minuto, segundo);
        return evento;
    }

    /**
     * Método que comprueba si la fecha del evento coincide con
     * otra fecha pasada como argumento de la función.
     *
     * @param fecha Fecha que se quiere comprobar si coincide con la fecha del evento
     * @return true si ambas fechas coinciden, false en caso contrario
     */
    public boolean coincide(Fecha fecha){
        boolean igual = anio == fecha.getAnio() && mes == fecha.getMes() && dia == fecha.getDia();
        //Caso en el que hay hora en ambos eventos
        if (hora >= 0 && fecha.hora >= 0){
            igual = igual && hora == fecha.getHora() && minuto == fecha.getMinuto() && segundo == fecha.getSegundo();
        }
        return igual;
    }

    /**
     * Método que comprueba si la fecha del evento es anterior a
     * otra fecha pasada como argumento de la función.
     *
     * @param fecha Fecha que se quiere comprobar si es posterior
     * @return true si la fecha es anterior a la pasada como argumento, false en caso contrario
     */
    public boolean anterior(Fecha fecha) {
        String thisString = "";
        String fechaString = "";
        if (hora >= 0 && fecha.hora >= 0){
            thisString = String.format("%04d%02d%02d%02d%02d%02d", anio, mes, dia, hora, minuto, segundo);
            fechaString = String.format("%04d%02d%02d%02d%02d%02d", fecha.getAnio(), fecha.getMes(), fecha.getDia(), fecha.getHora(), fecha.getMinuto(), fecha.getSegundo());
        } else {
            thisString = String.format("%04d%02d%02d", anio, mes, dia);
            fechaString = String.format("%04d%02d%02d", fecha.getAnio(), fecha.getMes(), fecha.getDia());
        }
        return thisString.compareTo(fechaString) < 0;
    }

    //Metodos estaticos
    /**
     * Función que comprueba si un año es bisiesto.
     * Se considera que un año es bisiesto si:
     * <ul>
     * <li> Es múltiplo de 4 y
     * <li> No es múltiplo de 100 o
     * <li> Es múltiplo de 400
     * </ul>
     *
     * @param anio Año a comprobar
     * @return true si el año es bisieto, false en caso contrario
     */
    public static boolean esBisiesto(int anio) {
        //Frecuencia de años bisiestos.
        final int ANIO_BISIESTO = 4;
        //Frecuencia de siglos (no bisiestos)
        final int SIGLO = 100;
        //Frecuencia de siglos bisiestos.
        final int SIGLO_BISIESTO = 400;
        return (anio % ANIO_BISIESTO == 0 && anio % SIGLO != 0) || anio % SIGLO_BISIESTO == 0;
    }

    /**
     * Función que comprueba si una fecha es correcta.
     * Una fecha es correcta cuando los valores de dia, mes y año
     * se encuentra dentro de sus correspondientes rangos, y además
     * se tiene en cuenta los rangos específicos para cada día de
     * cada mes, incluyendo la consideración de años bisiestos para
     * dar el 29 de febrero como válido.
     *
     * @param dia Dia del evento
     * @param mes Mes del evento
     * @param anio Año del evento
     * @return true si la fecha es correcta, false en caso contrario
     */
    public static boolean comprobarFecha(int dia, int mes, int anio) {
        boolean fechaCorrecta = anio >= PRIMER_ANIO && anio <= ULTIMO_ANIO && mes >= 1 && mes <= MESES_ANIO && dia >= 1 && dia <= DIAS_MES;
        if (fechaCorrecta){
            // Mes de Febrero tiene 28 días (29 en bisiesto)
            if (mes == Meses.FEBRERO.ordinal() + 1)
                fechaCorrecta = dia <= DIAS_FEBRERO || (dia <= DIAS_FEBRERO + 1 && esBisiesto(anio));
            //Meses de Abril, Junio, Septiembre y Noviembre tienen 30 días
            else if (mes == Meses.ABRIL.ordinal() + 1 || mes == Meses.JUNIO.ordinal() + 1
                    || mes == Meses.SEPTIEMBRE.ordinal() + 1 || mes == Meses.NOVIEMBRE.ordinal() + 1)
                fechaCorrecta = dia <= DIAS_MES - 1;
        }
        return fechaCorrecta;
    }

    /**
     * Función que comprueba si una hora es correcta.
     * Una hora es correcta cuando los valores de hora, minuto y
     * segundo se encuentran dentro de sus correspondientes rangos.
     *
     * @param hora Hora del evento
     * @param minuto Minutos del evento
     * @param segundo Segundos del evento
     * @return true si la hora es correcta, false en caso contrario
     */
    public static boolean comprobarHora(int hora, int minuto, int segundo) {
        return hora >= 0 && hora <= HORAS_DIA - 1
                && minuto >= 0 && minuto <= MINUTOS_HORA - 1
                && segundo >= 0 && segundo <= SEGUNDOS_MINUTO - 1;
    }

    /**
     * Retorna un objeto Fecha a partir de una cadena de texto formateada.
     *
     * @param texto Cadena de texto con la fecha formateada
     * @return Fecha del evento
     */
    public static Fecha fromString(String texto) {
        final int LENGTH = 3;
        Fecha evento = null;
        int dia = 0;
        int mes = 0;
        int anio = 0;
        int hora = -1;
        int minuto = -1;
        int segundo = -1;
        String[] division = texto.split(" ");
        //Fecha
        String[] fecha = division[0].split("/");
        if (fecha.length == LENGTH) {
            dia = Integer.parseInt(fecha[0]);
            mes = Integer.parseInt(fecha[1]);
            anio = Integer.parseInt(fecha[2]);
        }
        //Evento con hora
        if (division.length > 1) {
            String [] tiempo = division[1].split(":");
            if (tiempo.length == LENGTH) {
                hora = Integer.parseInt(tiempo[0]);
                minuto = Integer.parseInt(tiempo[1]);
                segundo = Integer.parseInt(tiempo[2]);
            }
        }
        //Formato de fecha correcto
        if (dia > 0) {
            if (hora >= 0)
                evento = new Fecha(dia, mes, anio, hora, minuto, segundo);
            else
                evento = new Fecha(dia, mes, anio);
        }
        return evento;
    }
}
