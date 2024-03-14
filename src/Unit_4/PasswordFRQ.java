package Unit_4;

import java.util.Random;
import java.util.Scanner;

/*
 * August Jones
 * 2023-12-06 07:51
 * AP CSA
 * :3
 */
public class PasswordFRQ {

    public static void main(String[] args) {
        Scanner uI = new Scanner(System.in);
        System.out.print("How many letter characters?: ");// asking user for how many letters should be in the password
        int l = uI.nextInt();
        System.out.print("How many special characters??: ");// asking for how many special characters should be in the
                                                            // password
        int sL = uI.nextInt();
        System.out.print("How many numbers?: ");// asking for how many numbers should be in the password
        int nL = uI.nextInt();
        String pass = generatePassword(l, sL, nL);
        pass = shuffle(pass, l);
        System.out.print("Your password is: " + pass);// shuffles the password before printing it out
    }

    public static String generatePassword(int l, int sL, int nL) {
        Random r = new Random();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < l; i++) {
            int cNum = r.nextInt(51) + 1;// either grabs a random letter from a-z or A-Z based on how many the user
                                         // wanted
            char c = (cNum < 26) ? 'A' : 'a';
            c = (char) (c + cNum % 26);// adds whatever letter was grabbed by the random int to char cast and adds it
                                       // to the stringbuilder
            str.append(c);

        }
        for (int i = 0; i < nL; i++) {
            int rNum = r.nextInt(10);// grabs a random number 0-9 and adds it to the stringbuilder based on how many
                                     // the user wanted
            str.append(rNum);
        }
        for (int i = 0; i < sL; i++) {
            String special = "!@#$%^&*()";// grabs random special char out of the string provided and puts it into the
                                          // stringbuilder based on how many the user wanted
            str.append(special.charAt(r.nextInt(10)));
        }
        return str.toString();// returns the stringbuilder as a string
    }

    public static String shuffle(String pass, int l) {
        Random r = new Random();
        StringBuilder str = new StringBuilder(pass);
        int count = 0;
        while (count != 10) {
            for (int i = 0; i < (pass.length() * 2); i++) {// for loop to shuffle the string and randomize the position
                                                           // of the characters
                int swapN = r.nextInt(pass.length());
                char swap = str.charAt(r.nextInt(pass.length()));// randomly chooses a character out of the string
                                                                 // length to move around
                str.setCharAt(swapN, str.charAt(i));// moves the char to where ever the for loop var is at
                str.setCharAt(i, swap);
            }
            count++;
        }
        return str.toString();// returns the shuffled stringbuilder as a string
    }
}