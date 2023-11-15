package OOP.WEEK7LABS.Orders;

import java.util.*;
import java.util.stream.Stream;

class Person {
    private String name;
    private int age;
    private List<Order> orderList;

    public Person(String name, int age, List<Order> orderList) {
        this.name = name;
        this.age = age;
        this.orderList = orderList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

}

class MainRun{
    public static void main(String[] args) {
        HashMap<Item, Integer> items= new HashMap<>();
        HashMap<Item, Integer> itemList = new HashMap<>();
        items.put(new Milk("123", "Meggle", 30.00, 3.8), 5);
        items.put(new Honey("222", "Pravi med", 30.00, HoneyType.LIVADSKI), 2);

        List<HashMap<Item, Integer>> orders = new ArrayList<>();
        orders.add(items);

        Order firstOrder = new Order(String.valueOf(1), new Date(System.currentTimeMillis()), orders);

        itemList.put(new Milk("123", "Nije meggle", 30.00, 3.8), 5);
        itemList.put(new Honey("222", "Jok med", 30.00, HoneyType.LIVADSKI), 2);
        items.put(new Milk("123", "Neki drugi", 30.00, 3.8), 5);

        List<HashMap<Item, Integer>> orders2 = new ArrayList<>();
        orders2.add(itemList);

        Order secondOrder = new Order(String.valueOf(1), new Date(System.currentTimeMillis()), orders);

        Person becir = new Person("Becko", 29, Arrays.asList(firstOrder));
        Person fikmo = new Person("Fikmet", 20, Arrays.asList(secondOrder));

        becir.setOrderList(
                Stream.concat(
                        becir.getOrderList().stream(),
                        Arrays.asList(secondOrder).stream())
                        .toList());

        //some marketplace
        List<Person> personList = new ArrayList<>();
        personList.add(becir);

        for(Person p : personList) {
            System.out.println("person " + p.getName() + " account:");
            for(Order o : p.getOrderList()) {
                System.out.println("Orders " + o.getOrderNumber() + "belongs to: " + p.getName());

                for(HashMap<Item, Integer> i : o.getItems()) {
                    for(Item it : i.keySet()) {
                        System.out.println("Order " + o.getOrderNumber() + " contains " + it.getBarCode() + " contains " + i.get(it));
                    }
                }
            }
        }
    }
}
