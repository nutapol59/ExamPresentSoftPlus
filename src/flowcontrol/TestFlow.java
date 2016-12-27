package flowcontrol;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by nbkf on 26/12/2559.
 */
public class TestFlow {
    public static void main(String[] args) {
        Integer b = 40;
        Integer c = new Integer(40);
        int num;
        System.out.println("--------------Do while Loop----------------");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("enter a number: ");
             num = scanner.nextInt();
        }while (num<0 || num>10);

        System.out.println("--------------If statement----------------");
        if(b==c){
            System.out.println("true");
        }else
            System.out.println("false");

        int a = 10, d = 30;
        System.out.println("--------------Conditional Operator----------------");
        System.out.println(a==d?"true":"false");


        System.out.println("--------------For loop----------------");
        for (int i = 0 ; i < 10 ; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("--------------While Loop----------------");
        int f = 10;
        while(f > 0){
            System.out.println(f);
            f--;
        }


        System.out.println("--------------Switch Case----------------");
        int check = 7;
        switch (check){
            case 1: System.out.println("your check " +check); break;
            case 7: System.out.println("your check " +check); break;
            case 2: System.out.println("your check " +check); break;
            case 3: System.out.println("your check " +check); break;

        }



    }
}
