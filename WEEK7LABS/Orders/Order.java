package OOP.WEEK7LABS.Orders;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Order {
    private Date date;
    private String orderNumber;
    private List<HashMap<Item, Integer>> items;

    public Order(String orderNumber, Date date, List<HashMap<Item, Integer>> items) {
        this.date = date;
        this.orderNumber = orderNumber;
        this.items = items;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<HashMap<Item, Integer>> getItems() {
        return items;
    }

    public void setItems(List<HashMap<Item, Integer>> items) {
        this.items = items;
    }
}
