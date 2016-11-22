package OOP4.delivery;

import java.util.LinkedList;

/**
 * Created by TheOriginMS7 on 15.11.2016.
 */
public class PostDelivery implements IDelivery {
    @Override
    public void deliver(LinkedList items) {
        System.out.println("It's post delivery");

    }
}
