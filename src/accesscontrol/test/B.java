package accesscontrol.test;
import accesscontrol.AccessTest;

public class B  extends AccessTest{
    public void test(){
    //  System.out.println(a);// a is default access ; default can use in same package only
    //  System.out.println(b);// b is private access ; private can use in own class only
      System.out.println(c);//can use because it's public
      System.out.println(d);
      //can use  because class B extend AccessTest 
      //but not extend will can't use because differrent package
    }
}
