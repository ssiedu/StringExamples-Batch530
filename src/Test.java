public class Test {
    private int x, y;
    
    public Test(int a, int b){
        x=a; y=b;
    }
    public void show(){
        System.out.println(x+","+y);
    }
    public void setX(int a){
        x=a;
    }
    public void setY(int a){
        y=a;
    }
}
