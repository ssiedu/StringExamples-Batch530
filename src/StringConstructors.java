
public class StringConstructors {

    public static void main(String[] args) {
        String s1=new String("indore");
        char ch[]={'a','b','c','d','e','f','g','h','i','j'};
        byte b[]={65,66,67,68,69,70,71,72,73,74,75,76};
        String s2=new String(ch);
        String s3=new String(ch,0,4);
        String s4=new String(b);
        String s5=new String(b,2,5);
        String s6=new String();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
/*
*   
    String()
    String(String)
    String(char[])
    String(char[],int,int)
    String(byte[])
    String(byte[],int,int)

*/