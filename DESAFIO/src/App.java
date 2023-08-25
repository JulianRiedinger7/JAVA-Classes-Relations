import Entities.Tienda;
import Services.TiendaService;

public class App {
    public static void main(String[] args) throws Exception {
        TiendaService ts = new TiendaService();

        for (int i = 0; i < 3; i++) {
            System.out.println("Tienda " + (i + 1));
            Tienda t = ts.crearTienda();
            ts.agregarProductos(t);

            System.out.println("STOCK ACTUAL");
            ts.stockProductos(t);

            ts.venderProductos(t);

            System.out.println("STOCK ACTUAL");
            ts.stockProductos(t);
        }
    }
}
