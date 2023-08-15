
import Entities.Baraja;

public class App {
    public static void main(String[] args) throws Exception {
        Baraja baraja = new Baraja();

        baraja.mostrarCartas();

        System.out.println("La cantidad de cartas en la baraja es de " + baraja.getCartas().size());
        baraja.barajar();

        System.out.println("barajado");
        baraja.mostrarCartas();

        System.out.println("Siguiente");

        System.out.println(baraja.siguienteCarta());
        System.out.println(baraja.cartasDisponibles());
        baraja.darCartas(10);
        System.out.println(baraja.cartasDisponibles());
        baraja.cartasMonton();
    }
}
