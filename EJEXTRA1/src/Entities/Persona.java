package Entities;

public class Persona {
    private String nombre;
    private Perro perro;

    public Persona() {}


    public Persona(String nombre, Perro perro) {
        this.nombre = nombre;
        this.perro = perro;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Perro getPerro() {
        return this.perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", perro='" + getPerro() + "'" +
            "}";
    }

}
