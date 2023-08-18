package Entities;

import java.util.HashSet;
import java.util.Set;

public class Voto {
    private Alumno alumno;
    private Set<Alumno> alumnosVotados = new HashSet<>();

    public Voto() {
    }

    public Voto(Alumno alumno, Set<Alumno> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumno() {
        return this.alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Set<Alumno> getAlumnosVotados() {
        return this.alumnosVotados;
    }

    public void setAlumnosVotados(Set<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "{" +
                " alumno='" + getAlumno() + "'" +
                ", alumnosVotados='" + getAlumnosVotados() + "'" +
                "}";
    }

}
