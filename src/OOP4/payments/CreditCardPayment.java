package OOP4.payments;

/**
 * Created by TheOriginMS7 on 10.11.2016.
 */
public class CreditCardPayment implements IPayment {
    @Override
    public void pay(double price) {
        System.out.println("You've payed for your order " + Double.toString(price) + " with credit card");
    }
}
