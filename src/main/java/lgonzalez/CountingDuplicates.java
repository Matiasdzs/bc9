package lgonzalez;

import java.util.Arrays;
import java.util.Stack;

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
        //tomar el string y guardarlo en un array de char
        char[] arrayList = text.toCharArray();
        int contador=0;
        String repetidos="";
        for (int i = 0; i < arrayList.length; i++) {
            //char auxiliar para comparar
            char aux = arrayList[i];
            for (int j = i+1; j < arrayList.length; j++) {
                if(aux == arrayList[j]){
                    CharSequence aux2 = new StringBuilder(1).append(aux);
                    if(!repetidos.contains(aux2)){contador++;}
                    repetidos+=aux;
                }
            }
        }
        return contador;
    }
    public static void main(String []args){
        System.out.println(duplicateCount("aabbcc"));
    }
}

