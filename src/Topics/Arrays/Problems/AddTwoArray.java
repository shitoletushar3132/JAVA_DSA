package Topics.Arrays.Problems;

import java.util.ArrayList;

public class AddTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {3,9,8};
        int [] arr2 = {9,8,8};
        ArrayList <Integer> res= new ArrayList<>();
        int i=arr1.length-1, j= arr2.length-1;

        int carry=0;
        while(i >= 0 || j>=0 || carry>0){
            int digit1 =i>=0 ? arr1[i--] : 0;
            int digit2 = j>=0 ? arr2[j--] : 0;

            int add = digit2 +digit1+ carry;
            res.add(0,add%10);
            carry = add/10;

        }

        System.out.println(res);
    }
}
