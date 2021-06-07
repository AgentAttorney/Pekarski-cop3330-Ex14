package Ex14;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args)
    {
        Locale locale = new Locale("en", "US");
        NumberFormat cur_format = NumberFormat.getCurrencyInstance(locale);

        Scanner input = new Scanner(System.in);
        System.out.print("What is the amount and state you are from? ");
        double subtotal = input.nextDouble();
        double total = subtotal;
        double tax;
        String state = input.next();

        String WI_state = "WI";
        if(WI_state.equals(state))
        {
            tax = subtotal * 0.055;
            System.out.println("The subtotal is " + cur_format.format(subtotal));
            System.out.println("The tax is " + cur_format.format(tax));
            BigDecimal bd = new BigDecimal(Double.toString(tax));
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            tax = bd.doubleValue();
            total = subtotal + tax;
        }
        System.out.print("The total is " + cur_format.format(total));

    }
}
