package OOP4.decorators;

import OOP4.Item;

/**
 * Created by TheOriginMS7 on 10.11.2016.
 */
public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item){
        super(item);
    }
    public double getTotalPrice(){
        return (4 + item.getTotalPrice());
    }
    public String getDescription(){
        return item.getDescription() + " in basket";
    }

}
