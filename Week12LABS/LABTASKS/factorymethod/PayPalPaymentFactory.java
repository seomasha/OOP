package OOP.Week12LABS.LABTASKS.factorymethod;

public class PayPalPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
