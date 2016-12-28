package formatting.Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by nbkf on 27/12/2559.
 */
public class Date2 {
    public static void main(String args[]) {
        Date dNow = new Date( );
        SimpleDateFormat ft = //EE = วันย่อ EEEE วันเต็ม
                              //yyyy = พ.ศ
                              //MM เดือนย่อ MMMM เดือน เต็ม
                              //dd วันที่
                new SimpleDateFormat ("EEEE yyyy.MM.dd 'at' hh:mm:ss a", new Locale("th","TH"));

        System.out.println("Current Date: " + ft.format(dNow));
    }
}
