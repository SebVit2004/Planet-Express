import java.util.Scanner;

/**
 * Description of the class
 *
 * @author Sebastian Vitiello
 * @author
 * @version     1.0
 */
public class Utilidades {

    /**
     * TODO: Solicita un número repetidamente hasta que se introduzca uno correcto (dentro de los límites)
     * @param teclado
     * @param mensaje
     * @param minimo
     * @param maximo
     * @return int numero
     */
    public static int leerNumero(Scanner teclado, String mensaje, int minimo, int maximo) {
        int numero;
        do {
            System.out.println(mensaje);
            numero = teclado.nextInt();
        }while (numero<minimo||numero>maximo);
        return numero;
    }

    /**
     * TODO: Solicita un número repetidamente hasta que se introduzca uno correcto (dentro de los límites)
     * @param teclado
     * @param mensaje
     * @param minimo
     * @param maximo
     * @return long numero
     */
    public static long leerNumero(Scanner teclado, String mensaje, long minimo, long maximo) {
        long numero;
        do {
            System.out.println(mensaje);
            numero = teclado.nextInt();
        }while (numero<minimo||numero>maximo);
        return numero;
    }

    /**
     * TODO: Solicita un número repetidamente hasta que se introduzca uno correcto (dentro de los límites)
     * @param teclado
     * @param mensaje
     * @param minimo
     * @param maximo
     * @return double numero
     */
    public static double leerNumero(Scanner teclado, String mensaje, double minimo, double maximo) {
        double numero;
        do {
            System.out.println(mensaje);
            numero = teclado.nextInt();
        }while (numero<minimo||numero>maximo);
        return numero;
    }

    /**
     * TODO: TODO: Solicita una letra repetidamente hasta que se introduzca uno correcto (dentro de los límites)
     * @param teclado
     * @param mensaje
     * @param minimo
     * @param maximo
     * @return char letra
     */
    public static char leerLetra(Scanner teclado, String mensaje, char minimo, char maximo) {
        char c;
        do {
            System.out.println(mensaje);
            String s = teclado.next();
            c = s.charAt(0);
        }while (c<minimo||c>maximo);
        return c;
    }
    /**
     * TODO: Solicita una fecha repetidamente hasta que se introduzca una correcta
     * @param teclado
     * @param mensaje
     * @return Fecha
     */
    public static Fecha leerFecha(Scanner teclado, String mensaje) {
        int dia;
        int mes;
        int anio;
        boolean continuar = false;
        do {
            System.out.println(mensaje);
            dia= teclado.nextInt();
            mes= teclado.nextInt();
            anio= teclado.nextInt();
            if((mes ==1||mes ==3||mes ==5||mes ==7||mes ==8||mes ==10||mes ==12)&&dia<=31)
                continuar=true;
            else if ((mes ==4||mes ==6||mes ==9||mes ==11)&&dia<=30)
                continuar=true;
            else if(mes==2&&anio%4==0&&dia<=29)
                continuar=true;
            else if(mes==2&&dia<=28)
                continuar=true;
        }while (!continuar);
        return new Fecha(dia, mes, anio);
    }


    /**
     * TODO: Solicita una fecha y hora repetidamente hasta que se introduzcan unas correctas
     * @param teclado
     * @param mensaje
     * @return Fecha
     */
    public static Fecha leerFechaHora(Scanner teclado, String mensaje) {
        int dia;
        int mes;
        int anio;
        int hora;
        int minuto;
        int segundo;
        boolean continuar = false;
        do {
            System.out.println(mensaje);
            dia= teclado.nextInt();
            mes= teclado.nextInt();
            anio= teclado.nextInt();
            hora=teclado.nextInt();
            minuto=teclado.nextInt();
            segundo=teclado.nextInt();
            if((mes ==1||mes ==3||mes ==5||mes ==7||mes ==8||mes ==10||mes ==12)&&dia<=31)
                continuar=true;
            else if ((mes ==4||mes ==6||mes ==9||mes ==11)&&dia<=30)
                continuar=true;
            else if(mes==2&&anio%4==0&&dia<=29)
                continuar=true;
            else if(mes==2&&dia<=28)
                continuar=true;
            if (hora>24||minuto>60||segundo>60)
                continuar=false;
        }while (!continuar);

        return new Fecha(dia, mes, anio, hora, minuto, segundo);
    }

    /**
     * TODO: Imprime por pantalla el String pasado por parámetro
     * @param teclado
     * @param s
     * @return
     */
    public static String leerCadena(Scanner teclado, String s) {
        System.out.print(s);
        return teclado.next();
    }
}
