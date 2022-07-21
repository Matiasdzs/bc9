package lgonzalez;

public class TenMinWalk {
    public static boolean isValid(char[] chars) {
        int[] cord = {0, 0};
        Boolean result = false;
        if(chars.length == 10){
            for (char aChar : chars) {
                switch (aChar) {
                    case 'n' -> cord[0]++;
                    case 's' -> cord[0]--;
                    case 'w' -> cord[1]++;
                    case 'e' -> cord[1]--;
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