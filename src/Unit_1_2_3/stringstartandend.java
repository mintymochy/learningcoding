
package Unit_1_2_3;

import java.util.*;

/*
 * August Jones
 * 2023-10-31 07:38
 * AP CSA≈
 *
 */
public class stringstartandend {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input word: ");
        String input = userInput.nextLine();
        input = input.toLowerCase();
        System.out.print(startsAndEndsWithSameCharacter(input));

    }

    public static boolean startsAndEndsWithSameCharacter(String string) {
        char first = 0;
        char last = 0;
        if (string != null && !string.isEmpty()) {
            first = string.charAt(0);
            int length = string.length();
            --length;
            last = string.charAt(length);
        }
        return first == last;
    }
}