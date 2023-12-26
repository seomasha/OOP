package OOP.Week12LABS.LABTASKS.builder;

import java.util.List;

public interface CoffeeBuilder {
    public CoffeeBuilder buildType(String type);
    public CoffeeBuilder buildSize(String size);
    public CoffeeBuilder buildToppings(List<String> toppings);
}
