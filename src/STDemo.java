
import java.util.StringTokenizer;


public class STDemo {

    public static void main(String[] args) {
        String s="indore,bhopal,delhi;chennai,newdelhi";
        
        StringTokenizer st=new StringTokenizer(s, ",;");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println(st.countTokens());
    }
}
/*
    StringTokenizer(String)
    StringTokenizer(String,String)

    String nextToken()
    boolean hasMoreTokens()
    int countTokens()
*/
