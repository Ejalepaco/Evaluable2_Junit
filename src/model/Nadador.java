package model;

public class Nadador {
    private String nombre;
    private int dorsal;
    private int edad;

    public Nadador(String nombre, int dorsal, int edad) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.edad = edad;
    }

    public Nadador(String pedro, String number, int edad) {

    }

    // Método para calcular si el nadador es mayor de edad
    public boolean esMayorEdad() {
        return edad >= 18;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}