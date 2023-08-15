package Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Perro;

public class PerroService {
    private Scanner input = new Scanner(System.in);
    static List<Perro> perros = new ArrayList<>();

    public void crearPerro() {
        Perro perro = new Perro();

        System.out.println("Ingrese el nombre del perro");
        perro.setNombre(input.nextLine());

        System.out.println("Ingrese la raza del perro");
        perro.setRaza(input.nextLine());

        perros.add(perro);

    }

    public void fabricaPerro() {
        char opcion;
        do {
            crearPerro();

            System.out.println("Desea seguir creando perro? S/N");
            opcion = input.nextLine().toUpperCase().charAt(0);
        } while (opcion == 'S');
    }

    public static void mostrarPerros() {
        if(!perros.isEmpty()) {
            System.out.println(perros.toString());
        }
    }
}
