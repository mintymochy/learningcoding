package Unit_6_7_8;

public class ez2darray {
    static int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
    static char[][] arr2 = new char[10][10];

    public static void main(String[] args) {
        for (int[] list : arr) {
            for (int arrnum : list) {
                System.out.println(arrnum);
            }
        }
        for (char[] r : arr2) {
            for (char w : r) {

            }
        }
    }

}