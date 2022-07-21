package dbustamante;

import java.util.ArrayList;
import java.util.List;
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

            String textto = text.replaceAll("[^A-Za-z\\d]", "");//Ingreso Alfanumerico limitado
            textto=textto.toLowerCase();//Elimina diferencias de mayusuculas y minúsculas
            List<Character> Array = new ArrayList<>();
            char[] arrayList = textto.toCharArray();
            for (char c : arrayList){
                Array.add(c);
            }
            List<Character> repetidos = new ArrayList<>();
            repetidos.add('0');
            int contador;
            int ref=0;
            //Ciclo for para selección de auxiliar a comparar
            for (int i = 0; i < Array.size(); i++) {
                //char auxiliar para comparar
                char aux = arrayList[i];
                //ciclo for para comparación con repetidos
                for (int j = i+1 ; j < Array.size(); j++) {
                    if(aux == arrayList[j]){
                        for (int l = 0; l < repetidos.size();l++) {
                            if(aux == repetidos.get(l)){
                                break;
                            }
                            else if (aux != repetidos.get(l)){
                                repetidos.add(aux);
                                repetidos.set(ref,aux);
                                ref++;
                                break;
                            }
                        }
                    }
                }
            }
            contador=repetidos.size()-1;
            return contador;
        }
        public static void main(String []args){
            System.out.println(duplicateCount("aab##%#&#$%&bccaa"));
        }
    }

