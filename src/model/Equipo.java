package model;

public class Equipo {

    private String nombre;
    private int participantes;

    public Equipo (String nombre, int participantes) {
        this.nombre = nombre;
        this.participantes = participantes;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }
}
