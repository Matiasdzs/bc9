package mzalazar;

import javax.management.ListenerNotFoundException;
import java.util.HashMap;

public class Estructuras {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        {

            //HashMap
            hashMap.put("England", "London");
            hashMap.put("Germany", "Berlin");
            hashMap.put("Norway", "Oslo");

            System.out.println("*************");
            System.out.println("******* GET ******");
            System.out.println(hashMap.get("England"));
            System.out.println("*************");

            System.out.println("*************");
            System.out.println("******* Remove ******");
            System.out.println(hashMap.remove("Berlin"));
            System.out.println("*************");

            System.out.println("*************");
            System.out.println(hashMap);
            System.out.println("*************");
        }



        //ArrayList

        //LIFO

        //FIFO

    }
}
