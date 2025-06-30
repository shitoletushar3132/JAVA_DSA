package Topics.Arrays.TwoD;

public class TwoD {
    // int [][] a = new int[4][4];

    //access -> a[row][col]
    public static void main(String[] args) {
        int [][] a = new int[3][3];
        // a.length -> the total number of rows
        // and a[1].length -> the total number of columns
        int [][] a1 = {{2,2,2},{3,4,5},{5,6,7,8}};

        for(int i=0; i<a1.length;i++){
            for(int j =0; j<a1[i].length;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
