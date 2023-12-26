package OOP.Week12LABS.LABTASKS.factorymethod;

public class PayPalPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("The payment is done with paypal.");
    }
}
