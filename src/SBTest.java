
public class SBTest {

    public static void main(String[] args) {
        String s1=new String("indore");
        StringBuffer sb=new StringBuffer("indore");
        String s2=sb.toString();
        
        boolean result=s1.equals(s2);
        System.out.println(result);
        
        
    }
}
