package Unit_1_2_3;

/*
 * August Jones
 * 2023-11-20 11:34
 * AP CSA
 * :3
 */
public class hourGlass {

    public static void main(String[] args) {
        int count = 0;
        int count2 = 0;
        int c = 8;
        for (int i = 1; i <= 10; i++) {
            if (i == 1)
                System.out.print("|");
            System.out.print("\"");
            if (i == 10)
                System.out.println("|");
        }
        while (count != 9) {
            if (count2 == 0) {
                System.out.print(" \\");
            } else if (count2 == 2) {
                System.out.print("  \\");
                c -= 2;
            } else if (count2 == 4) {
                System.out.print("\\    ");
                c -= 2;
            } else if (count2 == 6) {
                System.out.print("\\      ");
                c -= 2;
            } else if (count2 == 8) {
                System.out.print("\\       ");
                c -= 2;
            }
            for (int i = 0; i < c; i++) {
                System.out.print(":");
            }
            count2++;
            if (count2 == 1) {
                System.out.println("/");
            } else if (count2 == 3) {
                System.out.println("/  ");
            } else if (count2 == 5) {
                System.out.println("/     ");
            } else if (count2 == 7) {
                System.out.println("/       ");
            } else if (count2 == 9) {
                System.out.println("/         ");
            }
            count++;
        }
        for (int i = 1; i <= 10; i++) {
            if (i == 1)
                System.out.print("|");
            System.out.print("\"");
            if (i == 10)
                System.out.println("|");
        }
    }
}