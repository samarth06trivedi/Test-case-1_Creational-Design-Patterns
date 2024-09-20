// PayPalPayment.java
public class PayPalPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
