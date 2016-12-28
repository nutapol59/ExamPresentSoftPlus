package Operator;

/**
 * Created by nbkf on 27/12/2559.
 */
public class OperatorDemo1 {

    public static void main(String[] args){
        int a = 10 , b = 2;
        //The Arithmetic Operators
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));

        System.out.println("++a + b-- = " +( (++a)+(b--) ) ) ;

        System.out.println(a);
        System.out.println(b);
    }
}
