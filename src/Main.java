import Framework.OpcionesMenu;
import Framework.OpcionesPantalla;

public class Main {
    public static void main(String[] args) {
        char opcionKey = '7';
        do {
            OpcionesPantalla.LimpiarPantalla();
            opcionKey = OpcionesMenu.PresentarMenu();
        }while(opcionKey != '7');
        System.out.println("Gracias por usar el programa.");
    }
}