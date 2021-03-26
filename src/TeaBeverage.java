public class TeaBeverage extends Beverage {

    boolean hasLemon;
    int teaCost;
    @Override
    public int cost() {
        if (hasLemon)
            teaCost = 1;
        else
            teaCost = 0;
        return 0;
    }

    @Override
    public String withMilkorWithLemon() {
        if (this.hasLemon)
            return "with Lemon";
        return "without Lemon";
    }

    public TeaBeverage(boolean hasLemon, int size) {
        this.hasLemon = hasLemon;
        this.size = size;
    }

    public TeaBeverage() {
    }
}
