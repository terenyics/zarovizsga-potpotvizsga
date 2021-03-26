package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Clownfish extends Fish {

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color, false);
    }

    @Override
    public void feed() {
        super.feed();
        this.weight += 1;
    }
}
