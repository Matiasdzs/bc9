package earaya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Vives en una ciudad,
donde todas las carreteras están trazadas en una cuadrícula perfecta.
Llegó diez minutos antes de una cita, por lo que decidió aprovechar la oportunidad para dar un paseo.

La ciudad ofrece a sus ciudadanos una aplicación de generación de caminatas en sus teléfonos: cada vez que presiona el botón,
le envía una serie de cadenas de una letra que representan direcciones para caminar (por ejemplo, ['n', 's', 'e', 'w']).
Siempre caminas solo una cuadra por cada letra (dirección)
y sabes que te lleva un minuto atravesar una cuadra de la ciudad, así que crea una función que se vuelva verdadera si la caminata
que te da la aplicación te llevará exactamente diez minutos
¡No quiero llegar temprano o tarde!) y, por supuesto, lo devolverá a su punto de partida. Devolver falso de lo contrario.
 */

// validar que el array sea de 10
// validar que volvi al mismo lugar de partida
public class TenMinWalkTest {
    @Test
    public void Test() {
        assertEquals(true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals(false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals(false, TenMinWalk.isValid(new char[] {'w'}));
        assertEquals( false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }
}
