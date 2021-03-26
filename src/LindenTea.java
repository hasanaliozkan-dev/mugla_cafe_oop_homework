public class LindenTea extends TeaBeverage {

    public LindenTea() {
        setName("Linden Tea");
    }
    public LindenTea(boolean hasLemon, int size) {
        super(hasLemon, size);
        setName("Linden Tea");
    }

    @Override
    public int cost() {
        super.cost();
        if (this.size == SMALL)
            teaCost += 5;
        if (this.size == MEDIUM)
            teaCost += 6;
        if (this.size == LARGE)
            teaCost += 7;
        return teaCost;
    }
}
