package Unit_1_2_3;

import java.util.*;

/*
 * August Jones
 * 2023-11-21 07:50
 * AP CSA
 * :3
 */
public class frq {

    public static void main(String[] args) {
        boolean hasPrecipitation;
        Scanner uI = new Scanner(System.in);
        System.out.print("Is it a weekday?: ");
        boolean isWeekday = uI.nextBoolean();
        System.out.print("What if the tempature?: ");
        int temp = uI.nextInt();
        hasPrecipitation = temp > 40;
        if (isWeekday) {
            if (hasPrecipitation) {
                System.out.print("wear rain boots");
            } else {
                System.out.print("wear snow boots");
            }
        } else {
            if (temp > 59) {
                System.out.print("wear flipflops");
            } else {
                System.out.print("wear rainboots");
            }
        } // missing dress shoes and tennis shoes
    }
}