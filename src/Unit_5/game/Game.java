package Unit_5.game;

import java.util.*;

/* 
 August Jones 
 01-16-2024
 AP CSA
 :3
*/
public class Game {
    Level levelOne;
    Level levelTwo;
    Level levelThree;
    private boolean bonus;

    /** Postcondition: All instance variables have been initialized */
    public Game() {
        levelOne = new Level(generateRandomPoints(), generateRandomGoal());
        levelTwo = new Level(generateRandomPoints(), generateRandomGoal());
        levelThree = new Level(generateRandomPoints(), generateRandomGoal());
        bonus = generateRandomBonus();
    }

    /** Returns true if this game is a bonus game and returns false is otherwise */
    public boolean isBonus() {
        return bonus;
    }

    /**
     * Simulates play of this game (consisting of three levels) and updates all
     * relevant game data
     */
    public void play() {
        levelOne.setGoal(generateRandomGoal());
        levelOne.setPoints(generateRandomPoints());

        levelTwo.setGoal(generateRandomGoal());
        levelTwo.setPoints(generateRandomPoints());

        levelThree.setGoal(generateRandomGoal());
        levelThree.setPoints(generateRandomPoints());

        bonus = generateRandomBonus();
    }

    /**
     * Returns the score earned in the most recently played game, as described in
     * part (a)
     */
    public int getScore() {
        int score = 0;
        if (levelOne.goalReached()) {
            score += levelOne.getPoints();
        }
        if (levelTwo.goalReached() && levelOne.goalReached()) {
            score += levelTwo.getPoints();
        }
        if (levelThree.goalReached() && levelOne.goalReached() && levelTwo.goalReached()) {
            score += levelThree.getPoints();
        }
        if (isBonus()) {
            score *= 3;
        }
        return score;
    }

    /**
     * Simulates the play of num games and retuns the highest score earned as
     * described in part (b)
     * Precondition: num > 0
     */
    public int playManyTimes(int num) {
        int highScore = 0;
        int currentScore = 0;
        for (int i = 0; i <= num; i++) {
            play();
            currentScore = getScore();
            if (currentScore > highScore) {
                highScore = currentScore;
            }
        }
        return highScore;
    }

    public int generateRandomPoints() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public boolean generateRandomGoal() {
        Random r = new Random();
        return r.nextBoolean();
    }

    public boolean generateRandomBonus() {
        Random r = new Random();
        return r.nextBoolean();
    }
}