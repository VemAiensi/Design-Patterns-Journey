public interface Order {
    void placeOrder(String customerName, String address);
    public double getPrice();
    public String getName();
}
