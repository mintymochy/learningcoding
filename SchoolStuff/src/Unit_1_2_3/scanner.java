package Unit_1_2_3;

import java.util.*;

// August Jones
public class scanner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(
                "Enter what method you want to use:\n 1: Scientific\n 2: Word Padding\n 3: Birthday!!\n method: ");
        int method = userInput.nextInt();
        switch (method) {
            case 1:
                // problem 12
                System.out.print("Enter Number: ");
                double s = userInput.nextDouble();
                System.out.print("Enter Exponent: ");
                int ex = userInput.nextInt();
                System.out.println(s + " to the power of " + ex + " = " + scientific(s, ex));
                break;
            case 2:
                // problem 17
                System.out.print("Enter word: ");
                String word = userInput.nextLine();
                System.out.print("Enter Padding: ");
                int pad = userInput.nextInt();
                String spaces = padString(word, pad);
                int sp = spaces.length();
                System.out.print(sp);
                break;
            case 3:
                // problem 20
                System.out.print(inputBirthday());
                break;
        }

    }

    public static double scientific(double s, int ex) {
        return Math.pow((s * 10), ex);
    }

    public static String padString(String s, int l) {
        if (s.length() == l)
            return s;
        for (int i = s.length(); i < l; i++) {
            padString(s, 1);
        }
        return s;
    }

    public static String inputBirthday() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the month your were born: ");
        String month = userInput.nextLine();

        System.out.print("Enter the day you were born: ");
        int day = userInput.nextInt();

        System.out.print("Enter the year you were born: ");
        int year = userInput.nextInt();

        return "You were born on " + month + " " + day + ", " + year + ". Bazinga!";
    }
}