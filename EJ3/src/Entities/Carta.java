package Entities;


public class Carta {
    private Integer numero;
    private String palo;

    public Carta() {
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return this.palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", palo='" + getPalo() + "'" +
            "}";
    }
}
