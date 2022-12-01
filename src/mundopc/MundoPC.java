package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Raton raton1 = new Raton("usb", "Logitech");
        Teclado teclado1 = new Teclado("inalambrico", "Microsoft");
        Monitor monitor1 = new Monitor("LG", 24);

        Computadora computadora1 = new Computadora("BlackPC", monitor1, teclado1, raton1);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
    }
}
