package OOP.Week12LABS.LABTASKS.factorymethod;

public class Main {
    public static void main(String[] args) {
        PayPalPaymentFactory payPalPaymentFactory = new PayPalPaymentFactory();
        Payment payment1 = payPalPaymentFactory.createPayment();

        CreditCardPaymentFactory creditCardPaymentFactory = new CreditCardPaymentFactory();
        Payment payment2 = creditCardPaymentFactory.createPayment();

        payment1.processPayment();
        payment2.processPayment();
    }
}
