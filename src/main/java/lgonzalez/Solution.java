package lgonzalez;

public class Solution {
    public int solution(int number) {
        int sumador=0;
        for (int i=0; i<number; i++){
            if(i%3==0 || i%5==0)
                sumador+=i;
        }
        return sumador;
    }
}