package OOP4.payments;

/**
 * Created by TheOriginMS7 on 15.11.2016.
 */
public class PayPalPayment implements IPayment {
    @Override
    public void pay(double price) {
        System.out.println("You've payed for your order " + Double.toString(price) + " via PayPal");
    }
}
