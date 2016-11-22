package OOP4.decorators;

import OOP4.Item;

/**
 * Created by TheOriginMS7 on 10.11.2016.
 */
public abstract class ItemDecorator implements Item {
    protected Item item;
    public ItemDecorator(Item item){
        this.item = item;
    }
}
