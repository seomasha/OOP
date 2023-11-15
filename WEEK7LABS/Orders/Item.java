package OOP.WEEK7LABS.Orders;

abstract class Item {
    private String name;
    private String barCode;
    private double price;

    public Item(String name, String barCode, double price) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Milk extends Item {
    private double fat;

    public Milk(String name, String barcode, double price, double fat) {
        super(name, barcode, price);
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }
}

class Honey extends Item {
    private HoneyType honeyType;

    public Honey(String name, String barcode, double price, HoneyType honeyType) {
        super(name, barcode, price);
        this.honeyType = honeyType;
    }

    public HoneyType getHoneyType() {
        return honeyType;
    }

    public void setHoneyType(HoneyType honeyType) {
        this.honeyType = honeyType;
    }
}

enum HoneyType{
    LIVADSKI,
}