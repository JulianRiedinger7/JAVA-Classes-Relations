package Entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Simulador {
    private Scanner input = new Scanner(System.in);
    private List<Alumno> alumnos = new ArrayList<>();
    private List<String> nombresCompletos = new ArrayList<>();
    private Set<Integer> dnis = new HashSet<>();

    public List<Alumno> getAlumnos() {
        return this.alumnos;
    }


    public List<String> generarListado() {

        for (Nombre nombre : Nombre.values()) {
            int random = (int) Math.round(Math.random() * (Apellido.values().length - 1));

            nombresCompletos.add(nombre + " " + Apellido.values()[random]);

        }

        return nombresCompletos;
    }

    public Set<Integer> generarDnis() {

        while (dnis.size() < Nombre.values().length) {
            int random = (int) Math.round(Math.random() * 50);
            dnis.add(random);
        }

        return dnis;
    }

    public void crearAlumnos() {
        System.out.println("Ingrese una cantidad de alumnos para crear");
        int cantAlumos = Integer.parseInt(input.nextLine());

        List<Integer> dnisArray = new ArrayList<>(dnis);

        for (int i = 0; i < cantAlumos; i++) {
            alumnos.add(new Alumno(nombresCompletos.get(i), dnisArray.get(i)));
        }

        mostrarAlumnos();

    }

    public void mostrarAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void votacion(List<Alumno> alumnos) {
        Random random = new Random();
        for (Alumno alumno : alumnos) {
            Set<Alumno> votados = new HashSet<>();

            while (votados.size() < 3) {
                Alumno x = alumnos.get(random.nextInt(alumnos.size()));
                if(x.equals(alumno)) continue;
                x.setCantidadVotos(x.getCantidadVotos() + 1);
                votados.add(x);
            }

            Voto v = new Voto(alumno, votados);
            alumno.setVoto(v);
        }

        mostrarAlumnos();
    }

}