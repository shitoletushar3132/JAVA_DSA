package Topics.Strings;

public class ReplaceAsci {
    public static void main(String[] args) {
        String str= "cDEfg";
        // if even index char should be ++
        // if odd index char should be --
        // -> dCFeh
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length(); i++){
            if(i%2==0){
                sb.setCharAt(i,(char)(sb.charAt(i)+1));
            }else{
                sb.setCharAt(i,(char)(sb.charAt(i)-1));
            }
        }

        System.out.println(sb.toString());


    }
}
