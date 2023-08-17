import Entities.Cine;
import Entities.Pelicula;
import Services.EspectadorService;

public class App {
    public static void main(String[] args) throws Exception {
        Pelicula pelicula = new Pelicula("Oppenheimer", "Christopher Nolan", 180, 18);
        Cine cine = new Cine();
        cine.setPelicula(pelicula);
        cine.setPrecioEntrada(700.0);

        EspectadorService es = new EspectadorService();

        es.crearEspectador();

        System.out.println("SALA ANTES DE UBICAR A LOS ESPECTADORES:");
        cine.mostrarSala();

        cine.ubicarEspectadores();

        System.out.println("SALA LUEGO DE UBICAR A LOS ESPECTADORES");
        cine.mostrarSala();
    }
}
