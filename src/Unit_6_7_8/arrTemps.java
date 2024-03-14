package Unit_6_7_8;

/*
 02-05-2024
 augustjones
 :3                  
 */
public class arrTemps {
    public static void main(String[] args) {
        int[] temps = { 55, 50, 59, 69, 48, 30, 48 };
        System.out.println("temps above freezing: " + temps_above_30(temps));
        System.out.println("length of the list: " + temps.length);
        System.out.println("last value in the array: " + temps[temps.length - 1]);
        System.out.println("value in the middle: " + mid(temps));
        System.out.println("average of the temps: " + average(temps));
    }

    public static int temps_above_30(int[] temps) {
        int tempAboveFreezing = 0;
        for (int i : temps) {
            if (i >= 32) {
                tempAboveFreezing++;
            }
        }
        return tempAboveFreezing;
    }

    public static double average(int[] temps) {
        int sum = 0;
        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }
        return ((double) sum / temps.length);
    }

    public static int mid(int[] temp) {
        int mid = (7) / 2;
        return temp[mid];
    }
}