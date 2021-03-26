public class TestCafe {
    public static void main(String[] args) {
        Order order = new Order();
        CaffeineBeverage cBeverage = new Latte(true, Beverage.SMALL);
        order.add(new OrderItem(cBeverage, 2));
        cBeverage = new Cappucino(false, Beverage.MEDIUM);
        order.add(new OrderItem(cBeverage, 2));
        cBeverage = new Americano(true, Beverage.LARGE);
        order.add(new OrderItem(cBeverage, 1));




        TeaBeverage tBeverage = new BlackTea(false, Beverage.SMALL);
        order.add(new OrderItem(tBeverage, 3));
        tBeverage = new GreenTea(true,Beverage.MEDIUM);
        order.add(new OrderItem(tBeverage, 1));
        tBeverage = new LindenTea(true,Beverage.SMALL);
        order.add(new OrderItem(tBeverage, 1));



        System.out.println(order);
    }
}
