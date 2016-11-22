package OOP4;

import java.util.LinkedList;
import java.util.List;
import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;
import OOP4.parent.Flower;
import OOP4.parent.Spec;
import OOP4.spec.FlowerSpec;

/**
 * Created by TheOriginMS7 on 17.10.2016.
 */
public class FlowerBucket {
    private int defaultSize = 10;

    private int insertIndex = 0;
    private FlowerSpec[] a = new FlowerSpec[defaultSize];

    public void addFlower(FlowerSpec nw) {
        checkSize();
        a[insertIndex] = nw;
        insertIndex ++;
    }

    private void checkSize(){
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            FlowerSpec[] b = new FlowerSpec[defaultSize];
            for (int i = 0; i <= insertIndex; i ++) {
                b[i] = a[i];
            }
            a = b;
        }
    }
    public void sortByPrice() {
        for (int i = 1; i < insertIndex; i ++) {
            FlowerSpec tmp = a[i];
            int j = i - 1;
            while (j >= 0 && (a[i].getPrice() < a[j].getPrice())) {
                a[i] = a[j];
                j --;
            }
            a[j + 1] = tmp;
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i ++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }

    public double getTotalPrice(){
        int sum = 0;
        for (int i = 0; i < insertIndex; i++){
            sum += a[i].getPrice();
        }
        return sum;
    }

    public FlowerSpec[] selectFlowersByItsLength(double start, double end) {
        int tmpSize = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLength() <= end && a[i].getLength() >= start ) {
                tmpSize ++;
            }
        }
        FlowerSpec[] tmpPart = new FlowerSpec[tmpSize];
        int tmpIndex = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLength() <= end && a[i].getLength() >= start ) {
                tmpPart[tmpIndex] = a[i];
                tmpIndex ++;
            }
        }
        return tmpPart;
    }


    public List<FlowerSpec> searchFlower(FlowerSpec flower){

        List<FlowerSpec> tmp = new LinkedList<FlowerSpec>();
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].equals(flower))
                tmp.add(a[i]);
        }
        return tmp;
    }
}
