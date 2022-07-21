package cmillan;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int n = 0;
        int s = 0;
        int e = 0;
        int w = 0;
        int i = 0;
        while (i < walk.length) {
            if (walk[i] == 'n') {
                n++;
            } else if (walk[i] == 's') {
                s++;
            } else if (walk[i] == 'e') {
                e++;
            } else if (walk[i] == 'w') {
                w++;
            } else {
                return false;
            }
            i++;
        }
        return n == s && e == w;
    }



}
