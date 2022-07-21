package ggutierrez;

public class TenMinWalk {
    public static boolean isValid(char[] chars) {
        int[] cord = {0, 0};
        Boolean result = false;
        if(chars.length == 10){
            for (int i = 0; i < chars.length; i++) {
                switch (chars[i]){
                    case 'n': cord[0]++;
                        break;
                    case 's': cord[0]--;
                        break;
                    case 'w': cord[1]++;
                        break;
                    case 'e': cord[1]--;
                        break;
                }
            }
            if (cord[0] == 0 && cord[1] == 0) {
                result = true;
            } else
                result = false;
        }
        return result;
    }
}