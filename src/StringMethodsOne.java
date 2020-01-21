
public class StringMethodsOne {
    public static void main(String[] args) {
        String s1=new String("indore(mp) india  " );
        String s2=new String("indore(mp)");
        String s3=new String("Indore");
        
        
        
        boolean res1=s1.equals(s2);
        System.out.println(res1);
        
        boolean res2=s1.equalsIgnoreCase(s2);
        System.out.println(res2);
        
        boolean res3=s1.startsWith("in");
        System.out.println(res3);
    
        boolean res4=s2.endsWith("(mp)");
        System.out.println(res4);
            //indore    Indore
        int n=s1.compareTo(s2);
        System.out.println(n);
        
        
        
        
    }
}
/*
    (non-static)    Comparison
    boolean equals(String)
    boolean equalsIgnoreCase(String)
    boolean startsWith(String)
    boolean endsWith(String)
    int compareTo(String)
        s1.compareTo(s2)

            s1>s2       +ve no
            s1<s2       -ve no
            s1=s2       0



*/
