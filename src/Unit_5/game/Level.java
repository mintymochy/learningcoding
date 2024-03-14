package Unit_5.game;

import java.util.*;

/* 
 August Jones 
 01-16-2024
 AP CSA
 :3
*/
public class Level {
    private boolean goal;
    private int points;

    public Level(int points, boolean goal) {
        this.points = points;
        this.goal = goal;
    }

    /**
     * Returns true if the player reached the goal on this level and returns false
     * otherwise
     */
    public boolean goalReached() {
        return goal;
    }

    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setGoal(boolean goal) {
        this.goal = goal;
    }
}