package nFigueroa;

import java.util.ArrayList;

/**
 * Contar el número de duplicados
 *
 * Escriba la función duplicateCount, que devuelva
 * el numero (entero) de letras duplicadas.
 *
 * String de entrada:
 * 1. distinct case-insensitive
 * 2. Acepta solo Alfanumericos
 *
 * Ejemplos de retornos de la funcion
 *
 * "abcde" -> 0 # ningún carácter se repite más de una vez
 * "aabbcde" -> 2 # 'a' y 'b'
 * "aabBcde" -> 2 # 'a' aparece dos veces y 'b' dos veces (`b` y` B`)
 * "indivisibility" -> 1 # 'i' aparece seis veces
 * "aA11" -> 2 # 'a' y '1'
 * "ABBA" -> 2 # 'A' y 'B' ocurren dos veces
 */
public class CountingDuplicates {

    public static int duplicateCount(String text) {

        String textLower = text.toLowerCase();
        char[] charArray = textLower.toCharArray();

        String uniqueRepeats = ""; //Will keep track of unique repeats.
        int count = 0;

            for(int i = 0; i < charArray.length - 1; i ++) {
                String restOfString = textLower.substring(i + 1);

                //Convert single char to String to be used in method.
                String character = Character.toString(charArray[i]);

                //If not in uniqueRepeats, check if it is a repeat.
                if(!uniqueRepeats.contains(character)) {
                    if(restOfString.indexOf(character) != -1) {
                        //If it is a repeat, increase count and concat it to uniqueRepeats
                        count++;
                        uniqueRepeats += character;
                    }
                }
            }
            return count;
        }

    public static void main(String []args){
        System.out.println(duplicateCount("aabbcc"));
    }

}

