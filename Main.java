public class Main {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPaymentMethod("CreditCard");
        payment.makePayment(100.0);

        Payment paypalPayment = PaymentFactory.getPaymentMethod("PayPal");
        paypalPayment.makePayment(200.0);
    }
}
