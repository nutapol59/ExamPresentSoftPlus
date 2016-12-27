package JAVA.Assignment;

public class DefaultVariable{

    int a;
    static int b;
    static char cc;

    public static void main(String[] args) {
        DefaultVariable defaultVariable = new DefaultVariable();
        defaultVariable.test();

//      System.out.println(a); //a non static can't use in method static

        System.out.println(b); //b = 40;
        b = 10;
        System.out.println(b); //b = 10;
        System.out.println("aaa  "+cc);
    }

    public void test(){
        int x = 1;  //local require initial value
        System.out.println(x);
        b= 40;
        System.out.println(b); //b = 40;


    }

    public void test2(){
        System.out.println(a);
    }
}