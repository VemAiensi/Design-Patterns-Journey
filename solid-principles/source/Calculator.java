public class Calculator implements Cal{

    @Override
    public void calculateTotal(Order order, int quantity) {
        double total = order.getPrice() * quantity;
        System.out.println("Order total: $" + total);
    }
}
