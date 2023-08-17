package Entities;

import Services.EspectadorService;

public class Cine {
    private Pelicula pelicula;
    private Espectador[][] sala;
    private Double precioEntrada;
    private static String[] columnas = { "A", "B", "C", "D", "E", "F" };

    public Cine() {
        this.sala = new Espectador[8][6];
    }

    public Pelicula getPelicula() {
        return this.pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecioEntrada() {
        return this.precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    

    public void ubicarEspectadores() {
        for (Espectador esp : EspectadorService.espectadores) {
            if (puedeSentarse(esp)) {
                encontrarLugar(esp);
            }
        }
    }

    public boolean hayLugar() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                if (sala[i][j] == null) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean puedeSentarse(Espectador esp) {
        if (!hayLugar()) {
            System.out.println("La sala se encuentra llena");
            return false;
        }

        if (!(esp.getDinero() >= precioEntrada)) {
            System.out.println(esp.getNombre() + " no tiene suficiente dinero para la entrada");
            return false;
        }

        if (!(esp.getEdad() >= pelicula.getEdadMinima())) {
            System.out.println(esp.getNombre() + " no tiene edad suficiente para la pelicula");
            return false;
        }

        return true;
    }

    public void encontrarLugar(Espectador esp) {
        boolean lugarEncontrado = false;
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                if (sala[i][j] == null) {
                    lugarEncontrado = true;
                    sala[i][j] = esp;
                    System.out.println(esp.getNombre() + " sentado en " + (i + 1) + columnas[j]);
                    break;
                }
            }
            if (lugarEncontrado)
                break;
        }
    }

    public void mostrarSala() {
        for (int i = sala.length - 1; i >= 0; i--) {
            for (int j = 0; j < sala[0].length; j++) {
                Espectador esp = sala[i][j];
                if (esp == null) {
                    System.out.print((i + 1) + " " + columnas[j] + "  |");
                } else {
                    System.out.print((i + 1) + " " + columnas[j] + " X |");

                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
