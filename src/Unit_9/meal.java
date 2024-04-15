package Unit_9;

import java.util.*;

/*
 04-15-2024
 augustjones
 :3
 */
public class meal {
    private String entree;
    private double cost;

    public meal(String e, double c) {
        entree = e;
        cost = c;
    }

    public String toString() {
        return (entree + ", " + cost);
    }

    class DeluxeMeal extends meal {
        private String side;
        private String drink;

        public DeluxeMeal(String e, double c, String s, String d) {
            super(e, c);
            side = s;
            drink = d;
        }

        @Override
        public String toString() {
            return ("deluxe" + entree + "meal, $" + cost + 3);
        }

    }
}
