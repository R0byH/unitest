public class Persist {
    public static int persistence(long num){

        int repeticiones = 0;

        while(num > 9)

    {
        int producto = 1;
        while (num != 0) {
            long unidades = num % 10;
            producto *= unidades;
            num = (num - unidades) / 10;
        }
        repeticiones++;
        //System.out.println("Producto " + repeticiones + "º es:" + producto);
        num = producto;
    }
        return repeticiones;
    }
}
