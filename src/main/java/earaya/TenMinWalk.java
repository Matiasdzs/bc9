package earaya;

public class TenMinWalk {
    public static boolean isValid(char[] ruta) {

        //clausula
        if (!(ruta.length == 10)) {
            return false;
        }
        int nsPosition = 0;
        int ewPosition = 0;

        for (int i = 0; i < 10; i++) {
            char caminar = ruta[i];
            switch (caminar) {
                case 'n':
                    nsPosition++;
                    break;
                case 's':
                    nsPosition--;
                    break;
                case 'e':
                    ewPosition++;
                    break;
                case 'w':
                    ewPosition--;
                    break;
            }
        }
        return (nsPosition == 0 && ewPosition == 0); // boolean

    }
}
