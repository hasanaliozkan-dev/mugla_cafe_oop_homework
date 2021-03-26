import java.util.LinkedList;

public class Order {
    public int totalCost(){
        int total = 0;
        for (int i = 0; i <orderList.size() ; i++) {
            total += orderList.get(i).cost();
        }
        return total;
    }

    LinkedList<OrderItem> orderList = new LinkedList<>();
    public void add(OrderItem ordritm){
        orderList.addLast(ordritm);
    }

    @Override
    public String toString() {
        for (int i = 0; i < orderList.size() ; i++) {
            System.out.println(orderList.get(i).getAmount() + " " + orderList.get(i).bvrg.sizeName()+" "+
                    orderList.get(i).bvrg.getName()+" "+ orderList.get(i).bvrg.withMilkorWithLemon()+ " " +
                    orderList.get(i).bvrg.cost()*orderList.get(i).getAmount()+ " TL");

        }

        return "TOTAL : " + totalCost() + " TL";
    }

}
