package Unit_6_7_8;

/* 
 August Jones 
 02-23-2024
 AP CSA
 :3
*/
public class ArrayChanger {
    static int rowCount = 0;

    public static boolean isPostitiveRow(double[][] matrix, int r) {
        for (int j = 0; j < matrix[r].length; j++) {
            if (matrix[r][j] <= 0) {
                // addRow(r);
                rowCount++;
                return false; // returns false if there is a negative value in the row
            }
        }
        return true;
    }

    public static int numPostitiveRows(double[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            if (isPostitiveRow(matrix, i)) {
                count++; // counts amount of true values
            }
        }
        return count;
    }

    public static double[][] resize(double[][] matrix) {
        double[][] newMatrix = new double[numPostitiveRows(matrix)][matrix[0].length];
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (isPostitiveRow(matrix, i)) {
                for (int x = 0; x < newMatrix[0].length; x++) {
                    newMatrix[counter][x] = matrix[i][x];
                }
                counter++;
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        double[][] arr = { { 3.4, 5.3, -2.2 },
                { 1.1, 6.1, 7.8 },
                { -2.2, -1.2, 3 },
                { 2.2, 7.6, 1.2 },
                { -0.3, -0.9, -2.2 } };

        System.out.println(isPostitiveRow(arr, 1));
        double[][] newMatrix = resize(arr);
        for (int i = 0; i < newMatrix.length; i++) {
            for (int x = 0; x < newMatrix[i].length; x++) {
                System.out.print(newMatrix[i][x] + " ");
            }
        }
    }
}