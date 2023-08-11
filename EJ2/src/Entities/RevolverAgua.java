package Entities;

public class RevolverAgua {
    private Integer posicionActual, posicionAgua;

    public RevolverAgua() {}

    public Integer getPosicionActual() {
        return this.posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return this.posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "{" +
                " posicionActual='" + getPosicionActual() + "'" +
                ", posicionAgua='" + getPosicionAgua() + "'" +
                "}";
    }

    public void llenarRevolver() {
        this.posicionActual = (int) Math.floor((Math.random() * (8 - 1) + 1));
        this.posicionAgua = (int) Math.floor((Math.random() * (8 - 1) + 1));
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        if(posicionActual < 8) {
            posicionActual += 1;
        } else {
            posicionActual = 1;
        }
    }
}  
