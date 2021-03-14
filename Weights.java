package machine;

public enum Weights {

    WATER(200),
    MILK(50),
    COFFEE(15);

    private int weight;

    Weights(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

}
