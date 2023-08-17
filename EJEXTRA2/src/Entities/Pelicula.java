package Entities;

public class Pelicula {
    private String titulo, director;
    private Integer duracion, edadMinima;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion, Integer edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return this.duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMinima() {
        return this.edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "{" +
                " titulo='" + getTitulo() + "'" +
                ", director='" + getDirector() + "'" +
                ", duracion='" + getDuracion() + "'" +
                ", edadMinima='" + getEdadMinima() + "'" +
                "}";
    }

}
