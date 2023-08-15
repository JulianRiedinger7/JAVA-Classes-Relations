package Entities;

public class Perro {
    private String nombre, raza;
    private boolean adoptado;

    public Perro() {
        this.adoptado = false;
    }


    public Perro(String nombre, String raza, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.adoptado = adoptado;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isAdoptado() {
        return this.adoptado;
    }

    public boolean getAdoptado() {
        return this.adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", raza='" + getRaza() + "'" +
            ", adoptado='" + isAdoptado() + "'" +
            "}";
    }


}
