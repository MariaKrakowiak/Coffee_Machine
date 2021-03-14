package machine;

public enum Type {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);

    private int water;
    private int milk;
    private int bean;
    private int price;


    Type(int water, int milk, int bean, int price) {
        this.water = water;
        this.milk = milk;
        this.bean = bean;
        this.price = price;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBean() {
        return bean;
    }

    public int getPrice() {
        return price;
    }
}
