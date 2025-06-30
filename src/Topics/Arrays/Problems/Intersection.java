package Topics.Arrays.Problems;

import java.util.ArrayList;

public class Intersection {

    public static void main(String[] args) {

        int [] arr1 = {10,15,20,25,30,35};
        int [] arr2 = {11,13,15,17,18,20,30};
        ArrayList<Integer> res = new ArrayList<>();

        for(int num1:arr1){
            for(int num2:arr2){
                if(num1 == num2){
//                    res.add(num1);
                }
            }
        }

        int i=0;
        int j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                res.add(arr1[i]);
                i++;
                j++;
            }
        }

        System.out.println(res);
    }
}
