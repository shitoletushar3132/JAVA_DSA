package Topics.Basic;

public class SwitchStat {

    public static void main(String[] args) {
         int marks  = 50;

         switch (marks){
             case 50:
                 System.out.println("Avg");
                 break;

             case 35:
                 System.out.println("pass");
                 break;

             case 100:
                 System.out.println("high");
                 break;
         }
    }
}
