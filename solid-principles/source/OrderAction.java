public class OrderAction implements Order {
    private double price;
    private String name;

    public OrderAction(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void placeOrder(String customerName, String address) {
        // Simulate placing order in a system
        System.out.println("Order placed for " + customerName + " at " + address);
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getName() {
        return name;
    }
    
}