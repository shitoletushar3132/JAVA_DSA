package Topics.Arrays.Problems;

public class RotateArray {

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handles if k > n

        for (int i = 0; i < k; i++) {
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }

    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5};

        rotateArray(arr,2);

        for(int n: arr){
            System.out.print(n+" ");
        }
    }
}
