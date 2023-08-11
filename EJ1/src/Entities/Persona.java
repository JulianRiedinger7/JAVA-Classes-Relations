package Entities;

public class Persona {
    private String nombre, apellido;
    private Integer edad, documento;
    private Perro perro;

    public Persona() {};


    public Persona(String nombre, String apellido, Integer edad, Integer documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return this.documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
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
            ", apellido='" + getApellido() + "'" +
            ", edad='" + getEdad() + "'" +
            ", documento='" + getDocumento() + "'" +
            ", perro='" + getPerro() + "'" +
            "}";
    }


}
