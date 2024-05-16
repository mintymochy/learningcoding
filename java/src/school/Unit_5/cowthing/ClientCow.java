package Unit_5.cowthing;

import java.util.*;

/* 
 August Jones 
 01-25-2024
 AP CSA
 :3
*/
public class ClientCow {
    public static void main(String[] args) {
        Cow cow = new Cow("cow", "moo", 0);
        cow.milkCow();
        cow.milkCow();
        System.out.print(cow.getTimesMilked());
    }
}