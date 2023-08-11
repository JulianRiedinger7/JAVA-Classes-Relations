import java.util.Scanner;

import Entities.Juego;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantos jugadores participaran?");

        Juego juego = new Juego(Integer.parseInt(input.nextLine()));
        juego.ronda();
        input.close();
    }
}
