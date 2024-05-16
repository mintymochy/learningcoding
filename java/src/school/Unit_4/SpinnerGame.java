package Unit_4;

public class SpinnerGame {

    public static void main(String[] args) {
        playRound();
    }

    public static void playRound() {
        int score = 0;
        int result = 0;
        int pScore = 0;
        int pSpin = spin(1, 10);
        int cSpin = spin(2, 8);
        if (pSpin > cSpin) {
            score = pSpin - cSpin;
            System.out.print("You Win! +" + score + " points!");
        } else if (pSpin == cSpin) {
            int pSpin2 = spin(1, 10);
            int cSpin2 = spin(2, 8);
            if ((pSpin + pSpin2) > (cSpin + cSpin2)) {
                pScore += 1;
                System.out.print("You Win! +1 Point");
            } else if (pSpin2 == cSpin2) {
                System.out.print("Tie! 0 Points.");
            } else {
                pScore -= 1;
                System.out.print("You Lose!\n-1\nPoint.");
            }
        } else {
            score = pSpin - cSpin;
            System.out.print("You Lose! \n" + score + "\nPoints.");
        }
    }

    public static int spin(int pMin, int pMax) {
        return (int) Math.floor(Math.random() * (pMin - pMax + 1)) + pMin;
    }
}