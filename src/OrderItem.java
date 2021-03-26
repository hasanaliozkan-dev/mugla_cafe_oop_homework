public class OrderItem {
    private int amount;
    Beverage bvrg;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public OrderItem(Beverage bvrg, int amount){
        this.bvrg = bvrg;
        setAmount(amount);
    }
    public OrderItem(){

    }
    public int cost() {
        return this.getAmount()*this.bvrg.cost();
    }


}
