import java.awt.font.TextHitInfo;

public class Latte extends CaffeineBeverage {


    public Latte() {
        setName("Latte");
    }

    public Latte(boolean hasMilk, int size) {
        super(hasMilk,size);
        setName("Latte");

    }

    @Override
    public int cost() {
        super.cost();
        if (this.size == SMALL)
            coffeCost += 5;
        if (this.size == MEDIUM)
            coffeCost += 6;
        if (this.size == LARGE)
            coffeCost += 7;
        return coffeCost;
    }


}
