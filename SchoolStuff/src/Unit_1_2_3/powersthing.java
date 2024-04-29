package Unit_1_2_3;

import java.util.*;

/*
 * August Jones
 * 2023-11-13 07:34
 * AP CSA
 *
 */
public class powersthing {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = userIn.nextInt();
        System.out.print("Input times to execute: ");
        int ex = userIn.nextInt();
        printPowersOfN(num, ex);
        System.out.println();
        System.out.print("Input number: ");// :3
        int num2 = userIn.nextInt();
        printPowersOf2(num2);
    }

    public static void printPowersOfN(int num, int ex) {
        for (int i = 1; i <= ex; i++)
            System.out.print((int) (Math.pow(num, i)) + " ");
    }

    public static void printPowersOf2(int num) {
        for (int i = 0; i <= num; i++)
            System.out.print((int) (Math.pow(2, i)) + " ");
    } // :3
}