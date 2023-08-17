package Entities;

public class Espectador {
    private String nombre;
    private Integer edad;
    private Double dinero;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDinero() {
        return this.dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", edad='" + getEdad() + "'" +
                ", dinero='" + getDinero() + "'" +
                "}";
    } 

}
