package Day1Problems;

public class DemonstrateStaicVarible {
    static int a=5;
    static int b;
    static void myFunction(int c)
    {
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);
    }
    static {
        System.out.println("Static initialization block");
        b=a+10;
    }
    public static void main(String args[]){
        myFunction(20);
    }
}
