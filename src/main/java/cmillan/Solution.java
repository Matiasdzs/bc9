package cmillan;

public class Solution {
    public int solution(int number) {
        /* TODO: Code stuff here */
        var multi = 0;
        for (int i = 1; i< number; i++){
            if (i % 3 == 0) {
                multi += i;
                System.out.print("Total \n" + multi);
                System.out.print("suma \n" + i);
            } if (i % 5 == 0) {
                multi += i;
                System.out.print("total3 \n" + multi);
                System.out.print("suma3 \n" + i);
            }
        }return multi;
    }
}