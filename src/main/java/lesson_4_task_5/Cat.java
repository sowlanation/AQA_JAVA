package lesson_4_task_5;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    void eat(Plate plate) {
        if (appetite > plate.getFood()) {
            satiety = false;
            System.out.println("Моя кличка: " + name + ", спасибо, но я есть не буду, тк в тарелке для меня мало еды");
        } else {
            plate.FeedCat(appetite);
            satiety = true;
            System.out.println("Моя кличка: " + name + ". Моя насыщенность: " + satiety);
        }
    }
}
