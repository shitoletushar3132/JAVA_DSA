package Topics.Arrays.Problems;

public class RunningSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] res = new int[arr.length];

        int i = 0;
        int prev=0;
        while(i<arr.length){
            res[i]=arr[i]+prev;
            prev=res[i];
            i++;
        }

        for(int re:res){
            System.out.print(re+" ");
        }
    }
}
