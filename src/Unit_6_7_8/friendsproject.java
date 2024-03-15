package Unit_6_7_8;

import java.util.*;

/*
 03-14-2024
 augustjones
 :3
 */
public class friendsproject {
    static ArrayList<String> friends = new ArrayList<>();
    static Scanner uI = new Scanner(System.in);
    static ArrayList<String> bestfriends = new ArrayList<>();
    static ArrayList<Integer> bestlist = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello! PLease enter your friends first names! \nPress \"d\" when you are done!");
        String temp = "";
        do {
            temp = uI.next(); // ui input
            if (temp.equals("d"))
                break;// checks to see if they user wants to quit entering friends
            friends.add(temp);
        } while (true);
        System.out.println("Here is your list of friends!");
        for (int i = 0; i < friends.size(); i++) {// prting list of friends
            System.out.println(i + ". " + friends.get(i));
        }
        movies();
    }

    public static void movies() {
        System.out.println("Here are the friends your going to the movies with!: ");
        Random r = new Random(friends.size());
        String str = friends.get(r.nextInt(friends.size()));
        System.out.println(str);// prints first random friend
        String str2 = friends.get(r.nextInt(friends.size()));
        while (true) {
            if (str2.equals(str)) {
                str2 = friends.get(r.nextInt(friends.size()));
            } else {// checks to see if net generated string is a duplicate of the first if not it
                    // breaks the while loop
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
            tempInt = uI.nextInt();// user input
            if (tempInt == 0)
                break;
            String str = friends.get(tempInt);
            bestfriends.add(str);
            friends.remove(tempInt);// adds the selected friends to best friends and deletes them off the friends
                                    // list
        } while (true);
        System.out.println("Here is your list of friends!");
        for (int i = 1; i < friends.size(); i++) {
            System.out.println(i + ". " + friends.get(i));
        }
        System.out.println("Here is your list of Best friends!");
        for (int i = 1; i < bestfriends.size(); i++) {
            System.out.println(i + ". " + bestfriends.get(i));
        }
        // printing out the friends and best friends list
    }
}