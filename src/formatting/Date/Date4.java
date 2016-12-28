package formatting.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date4 {
    public static void main(String args[]) {


        SimpleDateFormat ft = new SimpleDateFormat ("YYY-MM-dd");
        String input = args.length == 0 ? "2016-12-27" : args[0];

        System.out.print(input + " Parses as ");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        }catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }
}
