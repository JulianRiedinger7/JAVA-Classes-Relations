package Services;

import java.util.Scanner;

import Entities.Perro;
import Entities.Persona;

public class PersonaService {
    private Scanner input = new Scanner(System.in);

    public void crearPersona() {
        Persona persona = new Persona();

        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(input.nextLine());

        adoptarPerro();
    }

    public void fabricaPersona() {
        char opcion;
        do {
            crearPersona();

            System.out.println("Desea seguir creando persona? S/N");
            opcion = input.nextLine().toUpperCase().charAt(0);
        } while (opcion == 'S');
    }

    public void adoptarPerro() {
        PerroService.mostrarPerros();

        boolean adoptado = false;
        boolean encontrado = false;
        String nombre = "";
        char opcion = 'N';

        do {
            System.out.println("Cual perro te gustaria adoptar?");
            nombre = input.nextLine();

            for (Perro perro : PerroService.perros) {
                if (perro.getNombre().equalsIgnoreCase(nombre)) {
                    encontrado = true;
                    if (perro.getAdoptado()) {
                        System.out.println(perro.getNombre() + " ya esta adoptado");
                    } else {
                        perro.setAdoptado(true);
                        adoptado = true;
                        System.out.println("Felicitaciones, adoptaste a " + perro.getNombre());
                        break;
                    }
                }
            }

            if (!encontrado)
                System.out.println(nombre + " no existe");

            encontrado = false;

            if (!adoptado) {
                System.out.println("Desea salir? S/N");
                opcion = input.nextLine().toUpperCase().charAt(0);
            }

        } while (!adoptado && opcion == 'N');

    }
}
