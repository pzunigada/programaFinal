package ProgramacionInformacion;

public class Articulos {
    static String[] descripcion;
    static String[] codigo;
    static float[] precio;

    public static void LecturaDatos(){
        descripcion = new String[]{"Fierro cromo bajo carbon x%",
                "Fierro cromo alto carbon x%",
                "Fierro manganeso low x%",
                "Fierro molivdeno low x%",
                "Silicio x%",
                "Niquel x%",
                "Fierro Silicio x%",
                "Fierro dulce liviano x%",
                "Niobio x%",
                "Bismuto x%",
                "Chatarra x%",
                "Metal 1",
                "Metal 2",
                "Metal 3"};

        codigo = new String[]{"C00001", "C00002", "C00003", "C00004", "C00005", "C00006", "C00007",
                "C00008", "C00009", "C000010", "C000011", "P00001", "P00002", "P00003"};

        precio = new float[]{7.9f,14.5f,27.3f,22.3f,50.4f,10.1f,12.5f,15.8f,12.8f,15.3f,0.7f,0.0f,0.0f,0.0f};

    }

    public static String getCodigo(int index){return codigo[index];}
    public static String getDescripcion(int index){return descripcion[index];}
    public static float getPrecio(int index){return precio[index];}

}
