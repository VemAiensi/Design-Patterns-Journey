public interface Invoice {
    void generateInvoice(Order order);
    void sendEmailNotification(String email);
}
