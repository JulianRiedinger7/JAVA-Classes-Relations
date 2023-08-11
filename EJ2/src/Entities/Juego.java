package Entities;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private List<Jugador> jugadores;
    private RevolverAgua revolver;

    public Juego() {}

    public Juego(int cantJugadores) {

        if(cantJugadores > 8 || cantJugadores < 2) {
            cantJugadores = 8;
        }

        this.jugadores = new ArrayList<>();

        for (int i = 0; i < cantJugadores; i++) {
            jugadores.add( new Jugador(i + 1) );
        }

        this.revolver = new RevolverAgua();
        revolver.llenarRevolver();
        System.out.println(revolver);
    }


    public List<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRevolver() {
        return this.revolver;
    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;
    }

    public void ronda() {
        boolean finJuego = false;

        while(!finJuego) {
            for (Jugador jugador : jugadores) {
                if(jugador.disparo(revolver)) {
                    finJuego = true;
                    break;
                }
            }
        }
    }


}
