package formatting.Number.Currency;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 * Created by nbkf on 27/12/2559.
 */
public class CurrencyDemo {
    public static void main(String[] args) {
        Currency curr = Currency.getInstance(new Locale("th","TH"));

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US); //have sign
        String n = numberFormat.format(3243243);
        System.out.println(n);

        System.out.println("The currency of Thailand is " + curr.getCurrencyCode());
    }
 }

