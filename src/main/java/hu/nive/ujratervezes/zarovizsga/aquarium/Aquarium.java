package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> fishes;

    public Aquarium() {
        fishes = new ArrayList<>();
    }

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void feed() {
        for (Fish fish : fishes) fish.feed();
    }

    public void removeFish() {
        List<Fish> toRemove = new ArrayList<>();
        for (Fish fish : fishes)
            if (fish.getWeight() >= 11) toRemove.add(fish);
        for (Fish fish : toRemove) fishes.remove(fish);
    }

    public List<String> getStatus() {
        List<String> statuses = new ArrayList<>();
        for (Fish fish : fishes) statuses.add(fish.status());
        return statuses;
    }

}