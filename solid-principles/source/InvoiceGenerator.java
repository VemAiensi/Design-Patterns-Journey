public class InvoiceGenerator implements Invoice{
    @Override
    public void generateInvoice(Order order) {
        // Simulate generating invoice file
        System.out.println("Invoice generated: " + order.getName() + ".pdf");
    }
    @Override
    public void sendEmailNotification(String email) {
        // Simulate sending email notification
        System.out.println("Email notification sent to: " + email);
    }
}
