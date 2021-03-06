package formatting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Formatting {

    public static void main(String[] args) {
//        // Create an instance of SimpleDateFormat used for formatting
//        // the string representation of date (month/day/year)
//        DateFormat df = new SimpleDateFormat("MMMM/dd/yyyy HH:mm:ss.SSS", new Locale("th","TH"));
//
//
//        // Get the date today using Calendar object.
//        Date today = Calendar.getInstance().getTime();
//        // Using DateFormat format method we can create a string
//        // representation of a date with the defined format.
//        String reportDate = df.format(today);
//
//        // Print what date is today!
//        System.out.println("Report Date: " + reportDate);

        int year;
        // Create a Gregorian calendar initialized
        // with the current date and time in the
        // default locale and timezone.

        GregorianCalendar gcalendar = new GregorianCalendar();

        // Display current time and date information.
        System.out.print("Date: ");
        System.out.print(" "+gcalendar.get(Calendar.MONTH));
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        // Test if the current year is a leap year
        if(gcalendar.isLeapYear(year)) {
            System.out.println("The current year is a leap year");
        }else {
            System.out.println("The current year is not a leap year");
        }


    }


}
