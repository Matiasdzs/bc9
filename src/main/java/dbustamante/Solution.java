package dbustamante;

import java.util.ArrayList;

public class Solution {
    public static int solution(int number){
        int multiploA=3;
        int multiploB=5;
        ArrayList<Integer> Array = new ArrayList<>();
        int suma=0;
        if(number<=0){
            return 0;
        }
        else{
            for (int i=number-1; i>=0;i--){
                if(i%multiploA==0 || i%multiploB == 0){
                    Array.add(i);
                }
            }
            for (int j=0; j < Array.size();j++){
                suma+=Array.get(j);
            }
            return suma;
        }
    }

    public static void main (String[] args){
        System.out.println(solution(1000));
    }
}
