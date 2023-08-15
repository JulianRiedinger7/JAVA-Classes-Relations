package Helpers;

import java.util.Random;

public class Helpers {
    private static final Random random = new Random();

    public static int random(int max, int min) {
        return random.nextInt(max - min + 1) + min;
    }
}
