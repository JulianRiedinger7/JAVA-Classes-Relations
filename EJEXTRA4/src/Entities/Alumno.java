package Entities;

import java.util.Objects;

public class Alumno {
    private String nombreCompleto;
    private Integer dni, cantidadVotos;
    private Voto voto;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, Integer dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = 0;
    }

    public Alumno(String nombreCompleto, Integer dni, Integer cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDni() {
        return this.dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantidadVotos() {
        return this.cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public Voto getVoto() {
        return this.voto;
    }

    public void setVoto(Voto voto) {
        this.voto = voto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alumno)) {
            return false;
        }
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombreCompleto, alumno.nombreCompleto) && Objects.equals(dni, alumno.dni)
                && Objects.equals(cantidadVotos, alumno.cantidadVotos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCompleto, dni, cantidadVotos);
    }

    @Override
    public String toString() {
        return "{" +
                " nombreCompleto='" + getNombreCompleto() + "'" +
                ", dni='" + getDni() + "'" +
                ", cantidadVotos='" + getCantidadVotos() + "'" +
                "}";
    }

}
