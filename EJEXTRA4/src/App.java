import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Entities.Alumno;
import Entities.Simulador;
import utils.Comparadores;

public class App {
    public static void main(String[] args) throws Exception {
        Simulador sim = new Simulador();
        List<Alumno> facilitadoresTitulares = new ArrayList<>();
        List<Alumno> facilitadoresSuplentes = new ArrayList<>();

        sim.generarListado();
        sim.generarDnis();
        
        sim.crearAlumnos();

        System.out.println("Votacion");
        sim.votacion(sim.getAlumnos());

        System.out.println();
        System.out.println("Alumnos ordenados por cantidad de votos");

        Collections.sort(sim.getAlumnos(), Comparadores.ordenarVotoMax);
        sim.mostrarAlumnos();
        
        for (int i = 0; i < sim.getAlumnos().size(); i++) {
            if(i < 5) {
                facilitadoresTitulares.add(sim.getAlumnos().get(i));
            } else {
                facilitadoresSuplentes.add(sim.getAlumnos().get(i));
            }
        }

        System.out.println("FACILITADORES TITULARES");
        System.out.println(facilitadoresTitulares);

        System.out.println("FACILITADORES SUPLENTES");
        System.out.println(facilitadoresSuplentes);
    }
}
