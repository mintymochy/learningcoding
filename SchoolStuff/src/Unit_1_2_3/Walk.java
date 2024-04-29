package Unit_1_2_3;

import java.util.*;

/*
 * August Jones
 * 2023-12-04 07:51
 * AP CSA
 * :3
 */
public class Walk {

    public static void main(String[] args) {
        randomWalk();
    }

    public static void randomWalk() {
        Random r = new Random();
        int rand = 0;
        int count = 0;
        while ((count != -3) && (count != 3)) {// runs until count is equal to -3 or 3
            rand = r.nextInt(3) - 1; // generates random number between -1 and 1
            count += rand;
            System.out.println("position = " + count);
        }
        System.out.print("Max position is " + count);
    }
}