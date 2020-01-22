
import java.util.StringJoiner;


public class SJDemo {

    public static void main(String[] args) {
        String s1="java";
        String s2="python";
        String s3="oracle";
        
        //StringJoiner sj=new StringJoiner("-");
        StringJoiner sj=new StringJoiner("-","{","}");
        sj.add(s1); sj.add(s2); sj.add(s3);
        System.out.println(sj);
    }
}
