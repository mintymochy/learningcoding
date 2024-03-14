package Unit_1_2_3;

import java.util.*;

public class project2 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter rounds you want to play!: ");
        int rounds = userInput.nextInt();
        for (int i = 0; rounds != i; i++) {
            System.out.println("Round " + i + "----------");
            playRound();
        }
    }

    public static void playRound() {
        int score;
        int pScore = 0;
        int pSpin = spin(1, 10);
        int cSpin = spin(2, 8);
        if (pSpin > cSpin) {
            score = pSpin - cSpin;
            pScore += score;
            System.out.println("You Win! +" + score + " points!");
            System.out.println("Your Score!: " + pScore);
        } else if (pSpin == cSpin) {
            int pSpin2 = spin(1, 10);
            int cSpin2 = spin(2, 8);
            if ((pSpin + pSpin2) > (cSpin + cSpin2)) {
                pScore += 1;
                System.out.println("You Win! +1 Point");
                System.out.println("Your Score!: " + pScore);
            } else if (pSpin2 == cSpin2) {
                System.out.println("Tie! 0 Points.");
                System.out.println("Your Score!: " + pScore);
            } else {
                pScore -= 1;
                System.out.println("You Lose!\n-1\nPoint.");
                System.out.println("Your Score!: " + pScore);
            }
        } else {
            score = pSpin - cSpin;
            pScore -= score;
            System.out.println("You Lose! \n" + score + "\nPoints.");
            System.out.println("Your Score!: " + pScore);
        }
    }

    public static int spin(int pMin, int pMax) {
        return (int) Math.floor(Math.random() * (pMin - pMax + 1)) + pMin;
    }
}