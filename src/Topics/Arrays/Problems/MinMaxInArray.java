package Topics.Arrays.Problems;

public class MinMaxInArray {

    public static int maxArr(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public  static int minArr(int [] arr){
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {-1,-32,-23,-23,-23};

        System.out.println(maxArr(arr));
        System.out.println(minArr(arr));
    }
}
