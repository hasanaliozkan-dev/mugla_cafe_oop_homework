public class BlackTea extends TeaBeverage {
    public BlackTea() {
        setName("Black Tea");
    }

    public BlackTea(boolean hasLemon, int size){
        super(hasLemon, size);
        setName("Black Tea");
    }

    @Override
    public int cost() {
        super.cost();
        if (this.size == SMALL)
            teaCost += 3;
        if (this.size == MEDIUM)
            teaCost += 4;
        if (this.size == LARGE)
            teaCost += 5;
        return teaCost;
    }
}
