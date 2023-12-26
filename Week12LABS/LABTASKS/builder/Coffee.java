package OOP.Week12LABS.LABTASKS.builder;

import java.util.List;

public class Coffee {
    private String type;
    private String size;
    private List<String> toppings;

    public Coffee(EspressoBuilder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public Coffee(LatteBuilder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public Coffee(CappuccinoBuilder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public static class EspressoBuilder implements CoffeeBuilder{
        private String type;
        private String size;
        private List<String> toppings;


        @Override
        public CoffeeBuilder buildType(String type) {
            this.type = type;
            return this;
        }

        @Override
        public CoffeeBuilder buildSize(String size) {
            this.size = size;
            return this;
        }

        @Override
        public CoffeeBuilder buildToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public Coffee constructCoffee() {
            return new Coffee(this);
        }
    }

    public static class CappuccinoBuilder implements CoffeeBuilder{
        private String type;
        private String size;
        private List<String> toppings;


        @Override
        public CoffeeBuilder buildType(String type) {
            this.type = type;
            return this;
        }

        @Override
        public CoffeeBuilder buildSize(String size) {
            this.size = size;
            return this;
        }

        @Override
        public CoffeeBuilder buildToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public Coffee constructCoffee() {
            return new Coffee(this);
        }
    }

    public static class LatteBuilder implements CoffeeBuilder{
        private String type;
        private String size;
        private List<String> toppings;


        @Override
        public CoffeeBuilder buildType(String type) {
            this.type = type;
            return this;
        }

        @Override
        public CoffeeBuilder buildSize(String size) {
            this.size = size;
            return this;
        }

        @Override
        public CoffeeBuilder buildToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public Coffee constructCoffee() {
            return new Coffee(this);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Coffee coffee = (Coffee) new Coffee.EspressoBuilder().buildSize("M").buildType("kraca");
    }
}