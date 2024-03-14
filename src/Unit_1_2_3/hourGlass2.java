package Unit_1_2_3;

/*
 * August Jones
 * 2023-11-20 08:00
 * AP CSA
 * :3
 */
public class hourGlass2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 1)
                System.out.print("|");
            System.out.print("\"");
            if (i == 10)
                System.out.println("|");
        }
        for (int c = 1; c <= 8; c++) {
            if (c == 1)
                System.out.print(" \\");
            System.out.print(":");
            if (c == 8)
                System.out.println("/ ");
        }
        for (int c = 1; c <= 6; c++) {
            if (c == 1)
                System.out.print("  \\");
            System.out.print(":");
            if (c == 6)
                System.out.println("/  ");
        }
        for (int c = 1; c <= 4; c++) {
            if (c == 1)
                System.out.print("   \\");
            System.out.print(":");
            if (c == 4)
                System.out.println("/    ");
        }
        for (int c = 1; c <= 2; c++) {
            if (c == 1)
                System.out.print("    \\");
            System.out.print(":");
            if (c == 2)
                System.out.println("/    ");
        }
        System.out.println("     ||");
        for (int c = 1; c <= 2; c++) {
            if (c == 1)
                System.out.print("    /");
            System.out.print(":");
            if (c == 2)
                System.out.println("\\   ");
        }
        for (int c = 1; c <= 4; c++) {
            if (c == 1)
                System.out.print("   /");
            System.out.print(":");
            if (c == 4)
                System.out.println("\\   ");
        }
        for (int c = 1; c <= 6; c++) {
            if (c == 1)
                System.out.print("  /");
            System.out.print(":");
            if (c == 6)
                System.out.println("\\ ");
        }
        for (int c = 1; c <= 8; c++) {
            if (c == 1)
                System.out.print(" /");
            System.out.print(":");
            if (c == 8)
                System.out.println("\\");
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