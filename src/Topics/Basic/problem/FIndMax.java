package Topics.Basic.problem;

public class FIndMax {

    public static void main(String[] args) {
        int a =10;
        int b=20;
        int c = 2;

        if(a>=b && a>=c){
            System.out.println(a);

        }else if(a<=b && c<=b){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
