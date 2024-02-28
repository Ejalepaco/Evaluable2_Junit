import model.Equipo;
import model.Nadador;


public class Entrada {
    public static void main(String[] args) {
        // Crear un equipo de natación sincronizada
        Equipo equipo = new Equipo("Equipo A", 5);

        // Crear un nadador
        Nadador nadador = new Nadador("Juan", 123, 17);


        // Verificar si el nadador es mayor de edad
        if (nadador.esMayorEdad()) {
            System.out.println(nadador.getNombre() + " es mayor de edad y puede participar en la prueba.");
        } else {
            System.out.println(nadador.getNombre() + " no es mayor de edad y no puede participar en la prueba.");
        }
    }
}
