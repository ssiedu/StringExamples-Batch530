
public class SBDemo {

    public static void main(String[] args) {
        //StringBuffer sb=new StringBuffer("abcdefgh");
        StringBuilder sb=new StringBuilder("abcdefgh");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.reverse();
        //sb.setLength(12);
        //sb.delete(2, 5);
        //sb.deleteCharAt(3);
        //sb.append("XYZ");//adds the contents at the end
        //sb.insert(0, "XYZ");
        //sb.replace(2, 5, "XYZ");
        System.out.println(sb);
        System.out.println(sb.length());
        
        
        
    }
}
/*
    append, insert, replace, deleteCharAt delete, 
    setLength, toString

*/