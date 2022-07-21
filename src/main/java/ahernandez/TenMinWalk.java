package ahernandez;

/*
Vives en una ciudad,
donde todas las carreteras están trazadas en una cuadrícula perfecta.
Llegó diez minutos antes de una cita, por lo que decidió aprovechar la oportunidad para dar un paseo.

La ciudad ofrece a sus ciudadanos una aplicación de generación de caminatas en sus teléfonos: cada vez que presiona el botón,
le envía una serie de cadenas de una letra que representan direcciones para caminar (por ejemplo, ['n', 's', 'e', 'o']).
Siempre caminas solo una cuadra por cada letra (dirección)
y sabes que te lleva un minuto atravesar una cuadra de la ciudad, así que crea una función que se vuelva verdadera si la caminata
que te da la aplicación te llevará exactamente diez minutos
¡No quiero llegar temprano o tarde!) y, por supuesto, lo devolverá a su punto de partida. Devolver falso de lo contrario.
 */




public class TenMinWalk {
    // validar que array sea de 10
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int direccion=0;
        int direccion2=0;


        // agregar un condicional que calcule, dentro de un ciclo
        for(int i = 0; i<10;i++) {
            char caminar=walk[i];
            switch (caminar) {
                case 'n':
                    direccion++;
                    break;
                case 's':
                    direccion--;
                    break;
                case 'e':
                    direccion2++;
                    break;
                case 'w':
                    direccion2--;
                    break;
            }
        }

        //validar que volvi al mismo lugar
        return direccion == 0 && direccion2==0;
    }

}
