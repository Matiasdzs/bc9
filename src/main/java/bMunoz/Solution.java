package bMunoz;

public class Solution
{
    public int solution(int number)
    {
       int Num = number;
       int mult3 = 3;
       int mult5 = 5;
       int result=0;

        if(Num > 0)
        {
            for (int i=1; i < Num; i++)
            {

                if (i % mult3 == 0)
                {
                    result += i;
                }
                else if (i % mult5 == 0)
                {
                    result += i;
                }


            }
            return result;
        }
        else
        {
            return result;
        }
    }

}
