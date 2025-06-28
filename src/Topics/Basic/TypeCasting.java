package Topics.Basic;

public class TypeCasting {

    public static void main(String[] args) {
         byte by =10;
         short sh = 10;
         int in = 10;
         long lo =10;

//         sh=by;


        byte b = (byte) 130;

//        System.out.println(b);


        char ch = 'A';

        in = ch;

//        System.out.println(in);
//        System.out.println(ch);
//        System.out.println((int)ch);


        ch = 70;

//        System.out.println(ch);
//        System.out.println((int) 200);

        ch = (char)(ch+1);
//        System.out.println(ch);


        ch = 'a' +1;
//        System.out.println('a'+ch);
        ch = (char)('a'+ch);
//        System.out.println(ch);

        System.out.println(10+20+"hello"+10+20);
        System.out.println(2+' '+4);
        System.out.println(2+" "+5);
        System.out.println("Hello" +'\t'+"world");
        System.out.println(2+'\t'+3);


    }
}
