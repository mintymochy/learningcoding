package Unit_1_2_3;

import java.util.*;

/*
 * August Jones
 * 2023-11-17 07:41
 * AP CSA
 *
 */
public class SquarePattern {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter Min: ");
        int min = userIn.nextInt();
        System.out.print("Enter Max: ");
        int max = userIn.nextInt();
        printSquare(min, max);
    }

    public static void printSquare(int min, int max) {
        int range = max - min + 1;
        for (int i = 0; i < range; i++) {
            int num = min + i;
            for (int j = 0; j < range; j++) {
                int printedNum = num + j <= max ? num + j : num + j - range;
                System.out.print(printedNum + " ");
            }
            System.out.println();
        }
    }
}