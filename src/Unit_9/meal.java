package Unit_9;

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

    class deluxemeal extends meal {
        private String side;
        private String drink;

        public deluxemeal(String e, double c, String s, String d) {
            super(e, c);
            side = s;
            drink = d;
        }

        @Override
        public String toString() {
            return ("deluxe" + entree + "meal, $" + (cost + 3.0));
        }

    }

    public static void main(String[] args) {
        meal burger = new meal("burger", 10);
        deluxemeal borger = burger.new deluxemeal("burger", 10.0, "fries", "coke");
        System.out.println("your order: ");
        System.out.println(borger.toString());
    }
}