package Operator;

public class OperatorDemo5 {
//The Assignment Operators

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c ;

        c = a + b;
        System.out.println("c = a + b = " + c);

        c += a;
        System.out.println("c += a  = " + c);

        c -= a;
        System.out.println("c -= a = " + c);

        c *= a;
        System.out.println("c *= a = " + c);

        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);

        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a  = " + c);
    }
}

