import java.util.Scanner;

import Entities.Perro;
import Entities.Persona;

public class App {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Persona p1 = crearPersona();
        Persona p2 = crearPersona();

        System.out.println("INFO " + p1.getNombre());
        System.out.println(p1);
        System.out.println("INFO " + p2.getNombre());
        System.out.println(p2);
    }

    public static Perro crearPerro() {
        Perro perro = new Perro();

        System.out.println("Ingrese el nombre del perro");
        perro.setNombre(input.nextLine());

        System.out.println("Ingrese la raza del perro");
        perro.setRaza(input.nextLine());

        System.out.println("Ingrese la edad del perro");
        perro.setEdad(Integer.parseInt(input.nextLine()));

        System.out.println("Ingrese el tamanio del perro");
        perro.setTamanio(input.nextLine());

        return perro;

    }

    public static Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(input.nextLine());

        System.out.println("Ingrese el apellido de " + persona.getNombre());
        persona.setApellido(input.nextLine());

        System.out.println("Ingrese la edad de " + persona.getNombre());
        persona.setEdad(Integer.parseInt(input.nextLine()));

        System.out.println("Ingrese el documento de " + persona.getNombre());
        persona.setDocumento(Integer.parseInt(input.nextLine()));

        Perro perro = crearPerro();

        persona.setPerro(perro);

        return persona;
    }
}
