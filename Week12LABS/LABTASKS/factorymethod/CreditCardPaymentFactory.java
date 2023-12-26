package OOP.Week12LABS.LABTASKS.factorymethod;

public class CreditCardPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
