package OOP4.decorators;

import OOP4.Item;

/**
 * Created by TheOriginMS7 on 10.11.2016.
 */
public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    public double getTotalPrice() {
        return (13 + item.getTotalPrice());
    }

    public String getDescription() {
        return item.getDescription() + " in paper wrap";
    }
}
