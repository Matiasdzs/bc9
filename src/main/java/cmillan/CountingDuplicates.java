package cmillan;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        //tomar el string y guardarlo en un array de char
        text = text.toLowerCase();
        //char[] arrayList = text.toCharArray();
        //int contador=0;
        StringBuilder t = new StringBuilder();
        //char auxiliar para comparar
        for (int i = 0; i < text.length() - 1; i++) {
            //for (igit statusnt j = i+1; j < arrayList.length; j++) {
            //                if(aux == arrayList[j]){
            //          a          contador++;
            //                }
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j) && !t.toString().contains(text.charAt(j) + "")) {
                    t.append(text.charAt(i));
                }
            }
        }
        return t.length();
    }

    public static void main(String []args){
        System.out.println(duplicateCount("aabbcc"));
    }
}