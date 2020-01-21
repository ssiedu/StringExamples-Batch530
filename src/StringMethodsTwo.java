
public class StringMethodsTwo {
    public static void main(String[] args) {
        String s="this is java and java is powerful";
        int idx1=s.indexOf('i');    //search strats 0
        System.out.println(idx1);
        
        int idx2=s.indexOf('i', 6); //search stars from 5
        System.out.println(idx2);
        
        int idx3=s.indexOf("is");
        System.out.println(idx3);
        
        int idx4=s.indexOf("is", 6);
        System.out.println(idx4);
        
        boolean res=s.contains("java");
        System.out.println(res);
        
    }
}
/*  
    non-static (searching)

    int indexOf(char)
        it will search the 1st occurence of given char
        in invoking string.

    int indexOf(char, int)
        it will search the 1st occurence of given char
        in invoking string but searching will start from
        the index given in second args.

    int indexOf(String)
        searchs a string in another one

    int indexOf(String,int)


*/