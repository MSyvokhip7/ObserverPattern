package OOP4.parent;

import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;

/**
 * Created by TheOriginMS7 on 24.10.2016.
 */
public abstract class Spec {
    protected FlowerColor color = null;
    protected double length = 0;
    protected int freshness;
    protected double price = 0;
    protected FlowerType type = null;

    public Spec(FlowerType type, double length, int freshness, FlowerColor color){
        this.color = color;
        this.length = length;
        this.freshness = freshness;
        this.type = type;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }
    public FlowerType getType() { return type;}

    public void setLength(double length) { this.length = length;}
    public double getLength() { return length;}

    public void setColor(FlowerColor color) {
        this.color = color;
    }
    public FlowerColor getColor() { return color;}

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setFresh(int freshness) {
        this.freshness = freshness;
    }
    public int isFresh() {
        return this.freshness;
    }

    public boolean equals(Spec otherSpec) {
        if (color != otherSpec.getColor()) return false;
        if (length != otherSpec.getLength()) return false;
        if (type != otherSpec.getType()) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + " price is " + String.valueOf(getPrice()) + " its color is " + getColor() + " fresh level is " + String.valueOf(isFresh()) + " its height " + String.valueOf(getLength());
    }
}
