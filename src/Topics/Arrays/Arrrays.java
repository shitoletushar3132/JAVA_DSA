package Topics.Arrays;

public class Arrrays {

    // a array is the collection of the similar types of data

    public static void main(String[] args) {
        //
        System.out.println("Result: " + 5 + 10 * 2);
        int[] data; // declaring an array
        data = new int[10]; // allocate memory

        // Initialize an array
        for(int i=0; i<10; i++){
            data[i] = i;
        }


        for(int val :data){
            System.out.println(val);
        }

        int i=0;
        int j=2;

        System.out.println("-------------case-------------");
        System.out.println(data[i]+", "+data[j]);
        swap(data[i],data[j]);
        System.out.println(data[i]+", "+data[j]);

        System.out.println("-------------case-------------");
        System.out.println(data[i]+", "+data[j]);
        swap(data,i,j);
        System.out.println(data[i]+", "+data[j]);

        System.out.println("-------------case-------------");
        int [] other = {100,200,400};
        System.out.println(data[0]+", "+other[0]);
        swap(data,other);
        System.out.println(data[0]+", "+other[0]);


    }


    public static void swap(int[]one, int[]two){
        int [] temp = one;
        one=two;
        two=temp;
    }

    public static void swap(int []arr,int i,int j ){
        System.out.println(arr[i]+" ,"+arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }


    public static void swap(int one, int two){
        int temp = one;
        one = two;
        two = temp;
    }
}
