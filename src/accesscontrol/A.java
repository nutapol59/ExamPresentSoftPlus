package accesscontrol;

public class A {

    public void test(){
        AccessTest accessTest = new AccessTest();
        System.out.println(accessTest.a);
     //   System.out.println(accessTest.b); //can't because b is private
        System.out.println(accessTest.c);
        System.out.println(accessTest.d);
    }
}
