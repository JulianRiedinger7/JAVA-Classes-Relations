package utils;

import java.util.Comparator;

import Entities.Alumno;

public class Comparadores {
    
    public static Comparator<Alumno> ordenarVotoMax = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o2.getCantidadVotos().compareTo(o1.getCantidadVotos());
        }
    };
}
