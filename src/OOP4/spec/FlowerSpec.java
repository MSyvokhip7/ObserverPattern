package OOP4.spec;

import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;
import OOP4.parent.Spec;

/**
 * Created by TheOriginMS7 on 24.10.2016.
 */
public class FlowerSpec{
    protected FlowerColor color;
    protected FlowerType type;
    protected double price;
    protected double length;

    public FlowerSpec(FlowerType type, FlowerColor color) {
        this.type = type;
        this.color = color;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }
    public FlowerType getType() { return type;}

    public void setColor(FlowerColor color) {
        this.color = color;
    }
    public FlowerColor getColor() { return color;}

    public void setLength(double length) { this.length = length;}
    public double getLength() { return length;}

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(Spec otherSpec) {
        if (color != otherSpec.getColor()) return false;
        if (type != otherSpec.getType()) return false;
        return true;
    }

    public String toString() {
        return "Flower type is " + type + ", color is " + color + ",length is " + length;
    }
}
