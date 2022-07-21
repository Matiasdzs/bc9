package lmoreno;

public class TenMinWalk {
    public static boolean isValid(char[] chars) {
        int[] cord = {0, 0};
        boolean result = false;
        if(chars.length == 10){
            for (char aChar : chars) {
                switch (aChar) {
                    case 'n':
                        cord[0]++;
                        break;
                    case 's':
                        cord[0]--;
                        break;
                    case 'w':
                        cord[1]++;
                        break;
                    case 'e':
                        cord[1]--;
                        break;
                }
            }
            result = cord[0] == 0 && cord[1] == 0;
        }
        return result;
    }
}
