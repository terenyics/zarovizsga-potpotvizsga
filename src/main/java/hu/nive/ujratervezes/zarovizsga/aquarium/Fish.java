package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    protected String name;
    protected int weight;
    protected String color;
    protected boolean memoryLoss;

    public Fish(String name, int weight, String color, boolean memoryLoss) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.memoryLoss = memoryLoss;
    }

    public String status() {
        return String.format("%s, weight: %d, color: %s, short term memory loss: %b",
                name, weight, color, memoryLoss);
    }

    public void feed() {}

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }
}
