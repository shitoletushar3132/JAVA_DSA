package Topics.Arrays.Problems;

public class ReverseArray {

    public static void reverse(int arr[]){
        int n = arr.length;
        for(int i=0;i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }

    public static void reverses(int[] arr){
        int i =0;
        int j = arr.length - 1;

        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public  static void display(int arr[]){
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {23,12,34,34,34};

        display(arr);
        reverse(arr);
        display(arr);

    }
}
