package lesson_4_task_5;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    void FeedCat(int appetite) {
        food -= appetite;
    }

    void addFood(int food) {
        this.food += food;
        System.out.println("    Внимание! В миску добавили " + food + " грамм корма!");
    }

    void info() {
        System.out.println("В тарелке осталось " + food + " еды");
    }
}
