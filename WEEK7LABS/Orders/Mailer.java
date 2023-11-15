package OOP.WEEK7LABS.Orders;

@FunctionalInterface
public interface Mailer {
    public void sendEmail(String recipient, String subject, String body);
}

class MailGrid implements Mailer {
    @Override
    public void sendEmail(String recipient, String subject, String body) {
        System.out.println("Email has been sent from MailGrid");
    }
}

class Mailgun implements Mailer{
    @Override
    public void sendEmail(String recipient, String subject, String body) {
        System.out.println("Email has been sent from Mailgun");
    }
}

class Main{
    public static void main(String[] args) {
        Mailer m = new MailGrid();
        m.sendEmail("Becko", "kasnis", "45 zavrsava");
    }
}