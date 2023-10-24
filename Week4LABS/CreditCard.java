package OOP.Week4LABS;

import java.util.Date;

class Main {
    public static void main(String[] args) {
        CreditCard sejosCard =
                new CreditCard("123",
                new Date(System.currentTimeMillis()),
                "099",
                CardType.CREDIT,
                CardBrand.MASTERCARD, 450);

        sejosCard.setCardNo("666");

        //ako imamo vise klasa il enuma u jednom fajlu sve je
        // pablik i ne moramo stavljat pablik nit mozemo jer je vec sve pabli

    }
}

class CreditCard {
    private String cardNo;
    private Date expiresAt;
    private String cvv;
    private CardType  cardType;
    private CardBrand cardBrand;
    private double balance;

    public CreditCard(String cardNo, Date expiresAt, String cvv, CardType cardType, CardBrand cardBrand, double balance) {
        this.cardNo = cardNo;
        this.expiresAt = expiresAt;
        this.cvv = cvv;
        this.cardType = cardType;
        this.cardBrand = cardBrand;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws Exception {
        if (this.balance <= 0) {
            throw new Exception("You can only deposit a positive amount into your bank account.");
        }
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardBrand getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(CardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }
}
enum CardType{
    CREDIT,
    DEBIT
}

enum CardBrand{
    MASTERCARD,
    VISA
}
