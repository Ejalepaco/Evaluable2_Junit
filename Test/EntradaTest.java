import static org.junit.Assert.*;

import model.Nadador;
import org.junit.Test;

public class EntradaTest {

        @Test

        public void testEsMayorEdad() {

            Nadador nadadorMayor = new Nadador("Pedro", "25", 17);

            Nadador nadadorMenor = new Nadador("Maria", "54", 20);

            assertTrue(nadadorMayor.esMayorEdad());
            assertFalse(nadadorMenor.esMayorEdad());
    }
}