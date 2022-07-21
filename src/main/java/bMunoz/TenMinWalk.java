package bMunoz;

import java.util.Locale;

public class TenMinWalk {

    public static boolean isValid(char[] chars)
    {
        if(!(chars.length == 10))
        {
            return false;
        }
        int contNS = 0;
        int contEO = 0;

        for (int i=0; i < chars.length;i++)
        {
            if(chars[i] == 'n')
            {
                contNS++;
            }
            else if(chars[i] == 's')
            {
                contNS--;
            }
            else if (chars[i] == 'e')
            {
                contEO++;
            }
            else
            {
                contEO--;
            }

        }

        if (contNS == 0 && contEO == 0)
        {
            return true;
        }
        return false;
    }

}
