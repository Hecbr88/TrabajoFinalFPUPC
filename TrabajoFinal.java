import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;

public class TrabajoFinal {

    static LinkedList personalNombre = new LinkedList();
    static LinkedList<String> codigoPersonal = new LinkedList<>();
    static int sueldoReponedor = 1025;
    static int sueldoCajero = 1200;
    static int sueldoSeguridad = 1300;
    static int sueldoEncargado = 1800;
    static int sueldoVendedor = 1600;
    static int mesesTurnoDia;
    static int mesesTurnoNoche;
    static double pagoVacaciones;


    public static void main(String[] args) throws IOException {

        System.out.println("");
        System.out.println("===================================================");
        System.out.println("============FUNDAMENTOS DE PROGRAMACION============");
        System.out.println("=================TRABAJO FINAL=====================");
        System.out.println("========U202217649 KEVIN DELGADILLO NAJARRO========");
        System.out.println("=====U202216860 RUBEN ALEJANDRO MANRIQUE CONDE=====");
        System.out.println("==========U202218399 HECTOR BRAVO LOPEZ============");
        System.out.println("===================================================");
        System.out.println("");

        inicializar();
        codigoPersonalMetodo();

        boolean condicion = true;

        while (condicion) {

            System.out.println("==================================================");
            System.out.println("==========SISTEMA DE PAGO DE VACACIONES===========");
            System.out.println("==================MIMARKET DONA===================");
            System.out.println("Menu:");
            System.out.println("\t1: Mostrar Lista de Personal MIMARKET DONA         ");
            System.out.println("\t2: Cargos del Personal MIMARKET DONA               ");
            System.out.println("\t3: Calculo de Vacaciones Personal MIMARKET DONA     ");
            System.out.println("\t4: Salir del sistema                            ");
            System.out.println("\t================================================");

            System.out.println("\tIngrese la opcion:");
            Scanner sc = new Scanner(System.in);
            int opcionSistema = sc.nextInt();

            switch (opcionSistema) {
                case 1:
                    System.out.println("La opcion seleccionada es Mostrar Lista de Personal MI MARKET: ");
                    mostrarListaPersonal();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("La opcion seleccionada es Cargos del Personal MI MARKET: ");
                    cargoPersonal();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("La opcion seleccionada es Calculo de Vacaciones Personal MI MARKET: ");
                    double pagoTotal = pagoVacaciones();
                    System.out.printf("El pago por vacaciones pendientes es: S/. %.2f",pagoTotal);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Saliendo del sistema, muchas gracias!");
                    condicion = !condicion;
                    break;
                default:
                    System.out.println("La opcion marcada no es correcta");
                    break;
            }

            if (condicion) {
                System.out.println("Presione la tecla \"ENTER\" para volver al menu principal...");
                System.in.read();
            }
        }
    }

    public static void inicializar() {

        personalNombre.add("Kevin Delgadillo Najarro            cod: E09433561");
        personalNombre.add("Ruben Alejandro Manrique Conde      cod: S10770909");
        personalNombre.add("Hector Hugo Bravo Lopez             cod: C70432558");
        personalNombre.add("Lisa Ana Solano Melchor             cod: V77161128");
        personalNombre.add("Gianni Gomez Cumba                  cod: R09588836");
        personalNombre.add("Karolina Beatriz Montoya Ramirez    cod: V43157810");
        personalNombre.add("Raul Schtoikov Perez Kovaleff       cod: R15458237");
    }

    public static void mostrarListaPersonal () {

        System.out.println("Cantidad de trabajadores en el sistema: " + personalNombre.size());

        for (int i = 0; i < personalNombre.size(); i++) {
            System.out.println("\t=>\tUsuario " + (i + 1) + ": " + personalNombre.get(i));
        }
    }

    public static void codigoPersonalMetodo () {

        codigoPersonal.add("R15458237");
        codigoPersonal.add("R09588836");
        codigoPersonal.add("C70432558");
        codigoPersonal.add("S10770909");
        codigoPersonal.add("V77161128");
        codigoPersonal.add("V43157810");
        codigoPersonal.add("E09433561");
    }

    public static void cargoPersonal () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del personal: ");
        String codigoPlanilla = sc.next();
        validarCodigo(codigoPlanilla);

        char inicialCodigoPlanilla = codigoPlanilla.charAt(0);

        String[] arregloCodigoPersonal = new String[codigoPersonal.size()];
        for(int i=0;i<arregloCodigoPersonal.length;i++) {
            arregloCodigoPersonal[i]=codigoPersonal.get(i);
        }

        switch (inicialCodigoPlanilla) {
            case 'R':
                for (int i=0;i< arregloCodigoPersonal.length;i++) {
                    if (arregloCodigoPersonal[i].equals(codigoPlanilla)) {
                        System.out.println("El cargo que desempenha el personal es : Reponedor(a)");
                    }
                }
                break;
            case 'C':
                for (int i=0;i< arregloCodigoPersonal.length;i++) {
                    if (arregloCodigoPersonal[i].equals(codigoPlanilla)) {
                        System.out.println("El cargo que desempenha el personal es : Cajero(a)");
                    }
                }
                break;
            case 'S':
                for (int i=0;i< arregloCodigoPersonal.length;i++) {
                    if (arregloCodigoPersonal[i].equals(codigoPlanilla)) {
                        System.out.println("El cargo que desempenha el personal es : Seguridad");
                    }
                }
                break;
            case 'E':
                for (int i=0;i< arregloCodigoPersonal.length;i++) {
                    if (arregloCodigoPersonal[i].equals(codigoPlanilla)) {
                        System.out.println("El cargo que desempenha el personal es : Encargado(a)");
                    }
                }
                break;
            case 'V':
                for (int i=0;i< arregloCodigoPersonal.length;i++) {
                    if (arregloCodigoPersonal[i].equals(codigoPlanilla)) {
                        System.out.println("El cargo que desempenha el personal es : Vendedor(a)");
                    }
                }
                break;
            default:
                break;
        }
    }

    public static double pagoVacaciones (){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del personal: ");
        String codigoPlanilla = sc.next();

        if(!(codigoPlanilla.equals("R15458237") || codigoPlanilla.equals("R09588836") || codigoPlanilla.equals("C70432558") ||
                codigoPlanilla.equals("S10770909") || codigoPlanilla.equals("E09433561") || codigoPlanilla.equals("V77161128") || codigoPlanilla.equals("V43157810"))) {
            System.out.println("Error de sistema...");
            System.out.println("Favor de iniciar el sistema nuevamente");
            System.exit(0);
        }

        System.out.println("Ingrese tiempo laborado(meses) en turno dia: ");
        mesesTurnoDia = sc.nextInt();
        System.out.println("Ingrese tiempo laborado(meses) turno noche");
        mesesTurnoNoche = sc.nextInt();

        char inicialCodigoPlanilla = codigoPlanilla.charAt(0);
        String[] arregloCodigoPersonal = new String[codigoPersonal.size()];
        for (int i = 0; i < arregloCodigoPersonal.length; i++) {
            arregloCodigoPersonal[i] = codigoPersonal.get(i);
        }

        switch (inicialCodigoPlanilla) {
            case 'R':
                for (int i = 0; i < arregloCodigoPersonal.length; i++) {
                    if (arregloCodigoPersonal[i].equals(codigoPlanilla)) {
                        pagoVacaciones = ((mesesTurnoDia * sueldoReponedor) / 12) + (1.25 * (mesesTurnoNoche * sueldoReponedor) / 12);
                    }
                }
                break;
            case 'C':
                for (int i = 0; i < arregloCodigoPersonal.length; i++) {
                    if (arregloCodigoPersonal[i].equals(codigoPlanilla)) {
                        pagoVacaciones = ((mesesTurnoDia * sueldoCajero) / 12) + (1.25 * (mesesTurnoNoche * sueldoCajero) / 12);
                    }
                }
                break;
            case 'S':
                for (int i = 0; i < arregloCodigoPersonal.length; i++) {
                    if (arregloCodigoPersonal[i].equals(codigoPlanilla)) {
                        pagoVacaciones = ((mesesTurnoDia * sueldoSeguridad) / 12) + (1.25 * (mesesTurnoNoche * sueldoSeguridad) / 12);
                    }
                }
                break;
            case 'E':
                for (int i = 0; i < arregloCodigoPersonal.length; i++) {
                    if (arregloCodigoPersonal[i].equals(codigoPlanilla)) {
                        pagoVacaciones = ((mesesTurnoDia * sueldoEncargado) / 12) + (1.25 * (mesesTurnoNoche * sueldoEncargado) / 12);
                    }
                }
                break;
            case 'V':
                for (int i = 0; i < arregloCodigoPersonal.length; i++) {
                    if (arregloCodigoPersonal[i].equals(codigoPlanilla)) {
                        pagoVacaciones = ((mesesTurnoDia * sueldoVendedor) / 12) + (1.25 * (mesesTurnoNoche * sueldoVendedor) / 12);
                    }
                }
                break;
            default:
                break;
        }
        return pagoVacaciones;
    }

    public static boolean validarCodigo(String codigoPlanilla) {

        boolean validacion=true;
        if(!(codigoPlanilla.equals("R15458237") || codigoPlanilla.equals("R09588836") || codigoPlanilla.equals("C70432558") ||
                codigoPlanilla.equals("S10770909") || codigoPlanilla.equals("E09433561") || codigoPlanilla.equals("V77161128") || codigoPlanilla.equals("V43157810"))) {
            System.out.println("Codigo incorrecto, favor de ingresar otro codigo");
        }
        return validacion;
    }
}