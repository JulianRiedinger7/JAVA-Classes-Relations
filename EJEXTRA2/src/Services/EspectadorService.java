package Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Espectador;

public class EspectadorService {
    private Scanner input;
    public static List<Espectador> espectadores = new ArrayList<>();

    public EspectadorService() {
        this.input = new Scanner(System.in);
    }

    public void crearEspectador() {
        char opcion;
        do {
            Espectador esp = new Espectador();

            System.out.println("Ingrese el nombre del espectador");
            esp.setNombre(input.nextLine());

            System.out.println("Ingrese la edad de " + esp.getNombre());
            esp.setEdad(Integer.parseInt(input.nextLine()));

            System.out.println("Ingrese el dinero de " + esp.getNombre());
            esp.setDinero(Double.parseDouble(input.nextLine()));

            espectadores.add(esp);

            System.out.println("Desea agregar un nuevo espectador?");
            opcion = input.nextLine().toUpperCase().charAt(0);
        } while (opcion == 'S');

    }
}
