package Framework;

public class OpcionesPantalla {

    public static void LimpiarBuffer() {
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void LimpiarPantalla(){
        for(int i=1; i<=80; i++) System.out.println();
    }

}
