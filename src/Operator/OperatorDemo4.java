package Operator;


public class OperatorDemo4 {
    //The Logical Operators
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
        System.out.println("a ^ b = " + (a^b));

    }
}
