package OOP.Week12LABS.LABTASKS.factorymethod;

public class CreditCardPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment is done using the credit card.");
    }
}
