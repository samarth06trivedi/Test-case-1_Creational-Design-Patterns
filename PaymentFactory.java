// PaymentFactory.java
public class PaymentFactory {
    public static Payment getPaymentMethod(String type) {
        if (type.equalsIgnoreCase("CreditCard")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("PayPal")) {
            return new PayPalPayment();
        }
        throw new IllegalArgumentException("Unknown payment method");
    }
}
