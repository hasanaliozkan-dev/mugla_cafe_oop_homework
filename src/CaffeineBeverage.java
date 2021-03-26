public class CaffeineBeverage extends Beverage {

    boolean hasMilk;
    int coffeCost;


    @Override
    public int cost() {
        if (hasMilk)
            coffeCost = 1;
        else
            coffeCost = 0;
        return 0;
    }

    @Override
    public String withMilkorWithLemon() {
        if (this.hasMilk)
            return "with Milk";
        return "without Milk";
    }
    public CaffeineBeverage(){

    }
    public CaffeineBeverage(boolean hasMilk, int size){
        this.hasMilk = hasMilk;
        this.size = size;
    }

}
