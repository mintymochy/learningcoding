package Unit_5.game;

import java.util.*;

/* 
 August Jones 
 01-16-2024
 AP CSA
 :3
*/
public class GameClient {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner userIn = new Scanner(System.in);
        System.out.print("how many times do you want to play?: ");
        int rounds = userIn.nextInt();
        int highScore = 0;
        for (int i = 1; i <= rounds; i++) {
            int score = game.playManyTimes(rounds);
            if (score > highScore) {
                highScore = score;
            }
            endGame(game, i);
        }
        System.out.println("High Score - " + highScore);
        System.out.println("-------------------------------------");
    }

    public static void endGame(Game game, int i) {
        System.out.print("Round: " + i);
        System.out.println(" ----------------------------");
        System.out.println("End of the game status:");
        System.out.println(
                "Level One: goal - " + game.levelOne.goalReached() + ", Points - " + game.levelOne.getPoints());
        System.out.println(
                "Level Two: Goal - " + game.levelTwo.goalReached() + ", Points - " + game.levelTwo.getPoints());
        System.out.println(
                "Level Three: Goal - " + game.levelThree.goalReached() + ", Points - " + game.levelThree.getPoints());
        System.out.println("Bonus: " + game.isBonus());
        System.out.println("Current Score: " + game.getScore());
        System.out.println("-------------------------------------");
    }
}