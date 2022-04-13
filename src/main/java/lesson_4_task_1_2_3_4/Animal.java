package lesson_4_task_1_2_3_4;

public class Animal {
    protected String name;
    private static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        System.out.println("Моя кличка: " + name + ", и я могу пробежать " + distance + " метров");
    }

    public void swim(int distance) {
        System.out.println("Моя кличка: " + name + ", и я могу проплыть " + distance + " метров");
    }
}
