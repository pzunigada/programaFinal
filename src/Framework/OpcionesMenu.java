package Framework;

import java.util.Scanner;

public class OpcionesMenu {

    public static char PresentarMenu() {
        Scanner consola = new Scanner(System.in);
        String[] opciones = {"1. Ingreso de Información para lista de materiales",
                             "2. Ingreso de Información para ruta de fabricación",
                             "3. Ingreso de tarifas para centros de trabajo",
                             "4. Ingreso de órdenes de trabajo",
                             "5. Control de ordenes de trabajo",
                             "6. Generación de estadística",
                             "7. Salir del programa"};
        for(int i=0;i<opciones.length;i++){
            System.out.println(opciones[i]);
        }
        System.out.print("Ingrese opcion a elegir ===> ");
        return consola.next().charAt(0);
    }

    public static void AccionesMenu(char opcionKey){
        switch (opcionKey){
            case('1'): break;
            case('2'): break;
            case('3'): break;
            case('4'): break;
            case('5'): break;
            case('6'): break;
            case('7'): break;
            default: System.out.println("Validar opcion de menú");
        }

    }

}
