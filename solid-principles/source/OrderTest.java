public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderAction("order_123", 10.0);
        Cal calcu = new Calculator();
        Invoice inv = new InvoiceGenerator();

        calcu.calculateTotal(order, 2);
        order.placeOrder("John Doe", "123 Main St");
        // invoice generation is now seperated
        inv.generateInvoice(order);
        inv.sendEmailNotification("johndoe@example.com");
    }
}
