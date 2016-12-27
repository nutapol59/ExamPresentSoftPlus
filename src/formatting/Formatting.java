package formatting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by nbkf on 27/12/2559.
 */
public class Formatting {

    public static void main(String[] args) {
        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date (month/day/year)
        DateFormat df = new SimpleDateFormat("MMMM/dd/yyyy HH:mm:ss.SSS", new Locale("th","TH"));


        // Get the date today using Calendar object.
        Date today = Calendar.getInstance().getTime();
        // Using DateFormat format method we can create a string
        // representation of a date with the defined format.
        String reportDate = df.format(today);

        // Print what date is today!
        System.out.println("Report Date: " + reportDate);
    }


}
