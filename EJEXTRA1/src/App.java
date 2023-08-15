import Services.PerroService;
import Services.PersonaService;

public class App {
    public static void main(String[] args) throws Exception {
        PersonaService ps = new PersonaService();
        PerroService sp = new PerroService();


        sp.fabricaPerro();
        ps.fabricaPersona();
    }
}
