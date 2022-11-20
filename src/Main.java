import Framework.OpcionesMenu;
import Framework.OpcionesPantalla;

public class Main {
    public static void main(String[] args) {
        // Lectura de la informacion para el sistema
        ProgramacionInformacion.Articulos.LecturaDatos();
        char opcionKey = '7';
        do {
            OpcionesPantalla.LimpiarPantalla();
            opcionKey = OpcionesMenu.PresentarMenu();
        }while(opcionKey != '7');
        System.out.println("Gracias por usar el programa.");


        // Prueba de la informacion de articulo
        System.out.println(ProgramacionInformacion.Articulos.getDescripcion(5));
    }
}