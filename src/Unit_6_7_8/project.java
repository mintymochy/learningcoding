package Unit_6_7_8;

import java.util.*;

/*
 03-14-2024
 augustjones
 :3
 */
public class project {
    static ArrayList<String> friends = new ArrayList<>();
    static Scanner uI = new Scanner(System.in);
    static ArrayList<String> bestfriends = new ArrayList<>();
    static ArrayList<Integer> bestlist = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello! PLease enter your friends first names! \nPress \"d\" when you are done!");
        friends();
        movies();
        bestFriends();
    }

    public static void friends() {
        String temp = "";
        do {
            temp = uI.nextLine();
            if (temp.equals("d"))
                break;
            friends.add(temp);
        } while (true);
        System.out.println("Here is your list of friends!");
        for (int i = 1; i < friends.size(); i++) {
            System.out.println(i + ". " + friends.get(i));
        }
    }

    public static void movies() {
        System.out.println("Here are the friends your going to the movies with!: ");
        Random r = new Random(friends.size());
        String str = friends.get(r.nextInt(friends.size()));
        System.out.println(str);
        String str2 = friends.get(r.nextInt(friends.size()));
        while (true) {
            if (str2.equals(str)) {
                str2 = friends.get(r.nextInt(friends.size()));
            } else {
                break;
            }
        }
        System.out.println(str2);
    }

    public static void bestFriends() {
        System.out.println("What friends do you want to change to your best friends?: ");
        System.out.println("(indicate with the number next to their names. Press \"0)\" to end.");
        int tempInt;
        do {
            tempInt = uI.nextInt();
            if (tempInt == 0)
                break;
            String str = friends.get(tempInt);
            bestfriends.add(str);
            friends.remove(tempInt);
        } while (true);
        System.out.println("Here is your list of friends!");
        for (int i = 1; i < friends.size(); i++) {
            System.out.println(i + ". " + friends.get(i));
        }
        System.out.println("Here is your list of Best friends!");
        for (int i = 1; i < bestfriends.size(); i++) {
            System.out.println(i + ". " + bestfriends.get(i));
        }
    }
}
