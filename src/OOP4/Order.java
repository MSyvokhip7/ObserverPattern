package OOP4;

import OOP4.delivery.DHLDelivery;
import OOP4.delivery.IDelivery;
import OOP4.delivery.PostDelivery;
import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;
import OOP4.payments.CreditCardPayment;
import OOP4.payments.IPayment;
import OOP4.payments.PayPalPayment;
import OOP4.spec.FlowerSpec;

import java.util.LinkedList;

/**
 * Created by TheOriginMS7 on 10.11.2016.
 */
public class Order {
    private LinkedList<FlowerBucket> items;
    private IPayment payment;
    private IDelivery delivery;

    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public IPayment getPayment() {
        return payment;
    }

    public IDelivery getDelivery() {
        return delivery;
    }

    public Order() {
        items = new LinkedList<>();
    }
    public void addItem(FlowerBucket item) {
        items.add(item);
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (FlowerBucket item : items){
            price += item.getTotalPrice();
        }
        return price;
    }

    public void proccessOrder() {
        if (payment != null){
            payment.pay(calculateTotalPrice());}
        delivery.deliver(items);
    }

    public static void main(String args[]){
        FlowerBucket bucket = new FlowerBucket();
        FlowerSpec romashka = new FlowerSpec(FlowerType.ROMASHKA, FlowerColor.WHITE);
        romashka.setPrice(1300);
        romashka.setLength(5.7);

        FlowerSpec tulip = new FlowerSpec(FlowerType.TULIP, FlowerColor.GREEN);
        tulip.setPrice(668);
        tulip.setLength(12.4);
        bucket.addFlower(tulip);
        bucket.addFlower(romashka);
        System.out.println("Creating our bucket... ");
        System.out.println(bucket);

        Order myOrder = new Order();

        myOrder.setDelivery(new PostDelivery());
        myOrder.setPayment(new PayPalPayment());
        myOrder.addItem(bucket);
        System.out.println("Creating order ...");
        myOrder.proccessOrder();
        System.out.println("Order complete successfully!");
    }
}

