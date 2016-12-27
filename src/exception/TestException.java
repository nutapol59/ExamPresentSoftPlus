package exception;

import java.util.MissingFormatArgumentException;

public class TestException {
    public static void main(String[] args) {
        try {
            A();
        }catch (Exception e){

        }finally {
            System.out.println("Hello");
        }

    }

    public static void A() throws Exception{
        String str = null;


        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("Error");
        }
    }

    public static void B() throws NullPointerException{
        int a = 3;
        System.out.println(a);
    }
}
