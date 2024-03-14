package Unit_6_7_8.Wordle;

/* 
 August Jones 
 02-23-2024
 AP CSA
 :3
*/
public class Wordle {
    public static void main(String[] args) {
        String[][] game = new String[12][6];
        String[] alp = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                "T", "U", "V", "W", "X", "Y", "Z" };
        for (int i = 0; i < game.length; i++) {
            for (int k = 0; k < game[0].length; k++) {
                game[i][k] = " ";
            }
        }

    }

}