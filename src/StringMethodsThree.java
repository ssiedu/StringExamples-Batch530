
public class StringMethodsThree {

    public static void main(String[] args) {

        //String s="this is java code";
        String s="ABCDEF";
        int counter=0;
        byte b[]=s.getBytes();
        for(byte tmp:b){
            System.out.println(tmp);
        }
        /*
        char ar[]=s.toCharArray();
        
        for(char ch:ar){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                counter++;
            }            
        }
        */
        
        /*
        int len=s.length();
        
        for(int i=0; i<len; i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                counter++;
            }
        }
        */
        
        System.out.println("Total Vowels : "+counter);
        
        
    }
}
/*
    //character extractions

    char charAt(int)
    char[] toCharArray()
    byte[] getBytes()

*/
