package Entities;

public class Jugador {
    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {}

    public Jugador(Integer id) {
        this.id = id;
        this.nombre = "Jugador " + this.id;
        this.mojado = false;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return this.mojado;
    }

    public boolean getMojado() {
        return this.mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", mojado='" + isMojado() + "'" +
            "}";
    }


    public boolean disparo(RevolverAgua r) {

        if(r.mojar()) {
            mojado = true;
            System.out.println(nombre + " ha sido mojado");
            return true;
        }

        System.out.println(nombre + " se ha salvado");
        r.siguienteChorro();
        return false;

    }

}
