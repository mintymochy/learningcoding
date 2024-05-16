package Unit_6_7_8;

/* 
 August Jones 
 02-16-2024
 AP CSA
 :3
*/
public class SwapPairsArrays {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        swapPairs(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void swapPairs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}