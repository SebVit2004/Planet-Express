import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Description of the class
 *
 * @author Sebastian Vitiello
 * @author
 * @version     1.1
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
        int numero = minimo-1;
        do {
            System.out.println(mensaje);
            try {
                String numeroString = teclado.next();
                if(numeroString.equalsIgnoreCase("cancelar")){
                    return minimo-1;
                }
                numero = Integer.parseInt(numeroString);
            }catch (InputMismatchException e){
                System.out.println(e);
            }
        } while (numero < minimo || numero > maximo);
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
        long numero = minimo-1;
        do {
            System.out.println(mensaje);
            try {
                String numeroString = teclado.next();
                if(numeroString.equalsIgnoreCase("cancelar")){
                    return minimo-1;
                }
                numero = Integer.parseInt(numeroString);
            }catch (InputMismatchException e){
                System.out.println(e);
            }
        } while (numero < minimo || numero > maximo);
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
        double numero = minimo-1;
        do {
            System.out.println(mensaje);
            try {
                String numeroString = teclado.next();
                if(numeroString.equalsIgnoreCase("cancelar")){
                    return minimo-1;
                }
                numero = Integer.parseInt(numeroString);
            }catch (InputMismatchException e){
                System.out.println(e);
            }
        } while (numero < minimo || numero > maximo);
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
        int dia=0;
        int mes=0;
        int anio=0;
        boolean continuar = false;
        do {
            try {
                System.out.println(mensaje);
                String diaString = teclado.next();
                if (diaString.equalsIgnoreCase("cancelar"))
                    return null;
                dia = Integer.parseInt(diaString);
                String mesString = teclado.next();
                if (mesString.equalsIgnoreCase("cancelar"))
                    return null;
                mes = Integer.parseInt(mesString);
                String anioString = teclado.next();
                if(anioString.equalsIgnoreCase("cancelar"))
                    return null;
                anio=Integer.parseInt(anioString);
                if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31)
                    continuar = true;
                else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30)
                    continuar = true;
                else if (mes == 2 && anio % 4 == 0 && dia <= 29)
                    continuar = true;
                else if (mes == 2 && dia <= 28)
                    continuar = true;
            }catch (InputMismatchException e){
                System.out.println(e);
            }
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
        int dia=0;
        int mes=0;
        int anio=0;
        int hora=0;
        int minuto=0;
        int segundo=0;
        boolean continuar = false;
        do {
            try {
                System.out.println(mensaje);
                System.out.print("Ingrese dia: ");
                String diaString = teclado.next();
                if (diaString.equalsIgnoreCase("cancelar"))
                    return null;
                dia = Integer.parseInt(diaString);
                System.out.print("Ingrese mes: ");
                String mesString = teclado.next();
                if (mesString.equalsIgnoreCase("cancelar"))
                    return null;
                mes = Integer.parseInt(mesString);
                System.out.print("Ingrese año: ");
                String anioString = teclado.next();
                if (anioString.equalsIgnoreCase("cancelar"))
                    return null;
                anio = Integer.parseInt(anioString);
                System.out.print("Ingrese hora: ");
                String horaString = teclado.next();
                if (horaString.equalsIgnoreCase("cancelar"))
                    return null;
                hora=Integer.parseInt(horaString);
                System.out.print("Ingrese minuto: ");
                String minutoString = teclado.next();
                if (minutoString.equalsIgnoreCase("cancelar"))
                    return null;
                minuto=Integer.parseInt(minutoString);
                System.out.print("Ingrese segundo: ");
                String segundoString = teclado.next();
                if (segundoString.equalsIgnoreCase("cancelar"))
                    return null;
                segundo=Integer.parseInt(segundoString);
                if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31)
                    continuar = true;
                else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30)
                    continuar = true;
                else if (mes == 2 && anio % 4 == 0 && dia <= 29)
                    continuar = true;
                else if (mes == 2 && dia <= 28)
                    continuar = true;

                if (hora > 24 || minuto > 60 || segundo > 60)
                    continuar = false;
            }catch (InputMismatchException e){
                System.out.println(e);
                continuar=false;
            }
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
