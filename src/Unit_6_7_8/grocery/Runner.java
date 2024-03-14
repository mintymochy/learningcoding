package Unit_6_7_8.grocery;

import java.util.*;

/* 
 August Jones 
 02-08-2024
 AP CSA
 :3
*/
public class Runner {
    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        list.add("cookie", 5.10, 4);
        list.add("cereal", 6.20, 5);
        list.add("candy", 3.40, 3);

        System.out.print(list);

    }
}