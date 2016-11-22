package OOP4.parent;

import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;
import OOP4.spec.FlowerSpec;

/**
 * Created by TheOriginMS7 on 24.10.2016.
 */
public abstract class Flower {

    protected FlowerSpec spec;
    protected int height;
    protected int freshness;

    public Flower(FlowerSpec flowerSpec, int height, int freshness) {
        this.spec = flowerSpec;
        this.height = height;
        this.freshness = freshness;
    }

    public FlowerSpec getSpec() {
        return spec;
    }

    public double getLength() { return height;}

    public abstract double getPrice();

    public int isFresh() {
        return freshness;
    }

    @Override
    public String toString() {
        return "Type: " + getSpec() + " price is " + String.valueOf(getPrice()) + " fresh level is " + String.valueOf(isFresh()) + " its height " + String.valueOf(getLength());
    }
}
