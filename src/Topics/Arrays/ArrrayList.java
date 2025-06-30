package Topics.Arrays;

import java.util.ArrayList;

public class ArrrayList {

    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(23);
        arrayList.add(232);
        arrayList.add(123);
        arrayList.add(432);


        System.out.println(arrayList);


        //access
        int num = arrayList.get(1);
        System.out.println(num);

        //change
        arrayList.set(1,3132);
        System.out.println(arrayList);


        //remove
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
