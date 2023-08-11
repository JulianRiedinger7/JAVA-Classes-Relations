package Entities;

public class Perro {
    private String nombre, raza, tamanio;
    private Integer edad;

    public Perro() {}


    public Perro(String nombre, String raza, String tamanio, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.edad = edad;
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

    public String getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", raza='" + getRaza() + "'" +
            ", tamanio='" + getTamanio() + "'" +
            ", edad='" + getEdad() + "'" +
            "}";
    }

}
