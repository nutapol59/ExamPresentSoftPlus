package formatting.Number.Currency;


import java.util.Currency;
import java.util.Locale;

public class Account {

    private Locale locale;
    private int amount;
    private Currency c;

    public Account(Locale locale, int amount) {
        this.locale = locale;
        this.amount = amount;
        this.c = Currency.getInstance(locale);
    }

    public int getAmount() {
        return amount;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public void status() {
        System.out.println(amount + " " + c.getCurrencyCode()+" in the account");
    }


    public void deposit(int deposit) {
        amount += deposit;
        System.out.println(deposit + " " + c.getCurrencyCode()+" deposited");
    }

    public void withdraw(int w) {
        if (w<amount) {
            amount -= w;
            System.out.println(w + " " + c.getCurrencyCode()+" withdrawed");
        } else {
            System.out.println("You can't withdraw  "+w+" "+ c.getCurrencyCode()+"!");
        }
    }

}
