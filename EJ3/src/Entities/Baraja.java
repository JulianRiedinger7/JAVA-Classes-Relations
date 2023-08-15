package Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Helpers.Helpers;

public class Baraja {
    private List<Carta> cartas;
    private List<Carta> monton;
    private Integer posSiguienteCarta;

    public Baraja() {
        this.cartas = new ArrayList<>();
        this.monton = new ArrayList<>();
        this.posSiguienteCarta = 0;

        Integer numeroRandom, paloRandom;
        String[] palos = { "oro", "basto", "espada", "copa" };
        do {
            Carta c = new Carta();
            paloRandom = Helpers.random(palos.length - 1, 0);

            do {
                numeroRandom = Helpers.random(12, 1);
            } while (numeroRandom == 8 || numeroRandom == 9);

            c.setNumero(numeroRandom);
            c.setPalo(palos[paloRandom]);

            if (existeCarta(c)) {
                continue;
            } else {
                cartas.add(c);
            }
        } while (cartas.size() < 40);

    }

    public boolean existeCarta(Carta c) {
        for (Carta carta : cartas) {
            if (carta.getNumero() == c.getNumero() && carta.getPalo() == c.getPalo())
                return true;
        }
        return false;
    }

    public List<Carta> getCartas() {
        return this.cartas;
    }

    public void mostrarCartas() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (posSiguienteCarta < 40) {
            Carta siguiente = cartas.get(posSiguienteCarta);
            System.out.println("Aqui esta la " + (posSiguienteCarta + 1) + " carta");
            monton.add(siguiente);
            this.posSiguienteCarta += 1;
            return siguiente;
        }

        System.out.println("No quedan mas cartas en la baraja");
        return null;
    }

    public Integer cartasDisponibles() {
        return 40 - posSiguienteCarta;
    }

    public List<Carta> darCartas(int numCartas) {
        List<Carta> cartasDevuetlas = new ArrayList<>();

        if (numCartas > cartasDisponibles()) {
            numCartas = cartasDisponibles();
        }

        for (int i = posSiguienteCarta; i < numCartas; i++) {
            Carta c = cartas.get(i);
            monton.add(c);
            cartasDevuetlas.add(c);
        }

        posSiguienteCarta += numCartas;
        return cartasDevuetlas;
    }

    public void cartasMonton() {
        if (monton.size() == 0) {
            System.out.println("Aun no ha salido ninguna carta");
        } else {
            System.out.println("Las cartas que ya han salido son: ");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        for (int i = posSiguienteCarta; i < 40; i++) {
            System.out.println(cartas.get(i));
        }
    }
 
}
