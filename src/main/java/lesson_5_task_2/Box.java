package lesson_5_task_2;

import java.util.ArrayList;

public class Box<T extends Fruit> implements BoxInterface {
    private ArrayList<T> box = new ArrayList<>();

    public float weight() {
        float weight = 0.0f;
        for (T result : box) {
            weight += result.weight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        if (weight() == anotherBox.weight()) {
            return true;
        }
        return false;
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }

    public void pourTo(Box<T> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }
}
