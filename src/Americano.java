public class Americano extends CaffeineBeverage {
    public Americano() {
        setName("Americano");
    }

    public Americano(boolean hasMilk, int size) {
        super(hasMilk, size);
        setName("Americano");
    }
    @Override
    public int cost() {
        super.cost();
        if (this.size == SMALL)
            coffeCost += 7;
        if (this.size == MEDIUM)
            coffeCost += 8;
        if (this.size == LARGE)
            coffeCost += 9;
        return coffeCost;
    }
}
