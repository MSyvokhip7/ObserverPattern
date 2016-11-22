package OOP4.delivery;

import java.util.LinkedList;

/**
 * Created by TheOriginMS7 on 10.11.2016.
 */
public class DHLDelivery implements IDelivery {
    @Override
    public void deliver(LinkedList items){
        System.out.println("It's DHL delivery");
    }
}
