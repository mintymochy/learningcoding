package Unit_1_2_3;

import java.util.*;

/*
 * August Jones
 * 2023-12-05 08:20
 * AP CSA
 * :3
 */
public class PrintAverage {

    public static void main(String[] args) {
        Scanner uI = new Scanner(System.in);
        int count = 0;
        int total = 0;
        System.out.print("Type a number: ");
        int num = uI.nextInt();
        total += num;
        while (num > 0) {
            System.out.print("Type a number: ");
            num = uI.nextInt();
            total += num;
            count++;
        }
        System.out.print("Average was " + (double) total / count);
    }
}