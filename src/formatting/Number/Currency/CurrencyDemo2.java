package formatting.Number.Currency;

import java.util.Locale;
//https://examples.javacodegeeks.com/core-java/util/currency/java-currency-example-working-with-money/
public class CurrencyDemo2 {

    public static void main(String[] args) {
        Account account = new Account(new Locale("th","TH"), 15000);
        account.status();
        account.withdraw(1000);
        account.status();
        account.deposit(5000);
        account.status();
        account.withdraw(100000);

    }





}

