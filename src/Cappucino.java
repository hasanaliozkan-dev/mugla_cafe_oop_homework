public class Cappucino extends CaffeineBeverage {
    public Cappucino(){
        setName("Cappucino");
    }
    public Cappucino(boolean hasMilk, int size){
        super(hasMilk,size);
        setName("Cappucino");
    }
    @Override
    public int cost() {
        super.cost();
        if (this.size == SMALL)
            coffeCost += 6;
        if (this.size == MEDIUM)
            coffeCost += 7;
        if (this.size == LARGE)
            coffeCost += 8;
        return coffeCost;
    }



}
