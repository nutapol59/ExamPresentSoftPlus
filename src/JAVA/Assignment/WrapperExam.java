package JAVA.Assignment;

/**
 * Created by nbkf on 26/12/2559.
 */
public class WrapperExam { //primitive isn't Object  Wrapper class Help cast Primitive(+-*/) into Object(compare max min)
    public static void main(String[] args) {
        //Converting int into Integer
        int a = 20;
        int b = 33;

        Integer i=Integer.valueOf(a);//converting int into Integer

        Integer ii = new Integer(b);

        Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a+" "+i+" "+j);

        //-----------------------------------------------------

        //Converting Integer to int
//        Integer a = new Integer(3);
//        int i = a.intValue();//converting Integer to int
//        int j = a;//unboxing, now compiler will write a.intValue() internally
//
//        System.out.println(a+" "+i+" "+j);
    }
}
