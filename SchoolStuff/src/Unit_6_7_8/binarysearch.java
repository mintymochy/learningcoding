package Unit_6_7_8;

public class binarysearch {
    public static void main(String[] args) {

    }

    public static int binarysearchtest(int[] arr, int num) {
        int high = arr.length - 1;
        int low = 0;
        while (low < high) {
            int middle = (low + high) / 2;
            if (arr[middle] == num) {
                return middle;
            } else if (arr[middle] > num) {
                high = middle;
            } else {
                low = middle;
            }
        }
        return -1;
    }

    public static int seqentialsearch(int[] arr, int num) {
        for (int n : arr) {
            return (arr[n] == num) ? num : -1;
        }
        return -1;
    }
}