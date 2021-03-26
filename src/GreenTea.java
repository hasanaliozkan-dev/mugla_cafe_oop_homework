public class GreenTea extends TeaBeverage {
    public GreenTea() {
    }

    public GreenTea(boolean hasLemon, int size) {
        super(hasLemon, size);
        setName("Green Tea");
    }

    @Override
    public int cost() {
        super.cost();
        if (this.size == SMALL)
            teaCost += 4;
        if (this.size == MEDIUM)
            teaCost += 5;
        if (this.size == LARGE)
            teaCost += 6;
        return teaCost;
    }
}
