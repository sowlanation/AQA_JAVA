package lesson_4_task_1_2_3_4;

public class Dog extends Animal {
    int maxRun = 500;
    int maxSwim = 10;
    private static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance >= maxRun) {
            System.out.println("Моя кличка: " + name + " , извини, я не умею бегать на эту дистанцию: " + distance);
        } else {
            System.out.println("Моя кличка: " + name + ", и я могу пробежать " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance >= maxSwim) {
            System.out.println("Моя кличка: " + name + " , извини, я не умею плавать на эту дистанцию: " + distance);
        } else {
            System.out.println("Моя кличка: " + name + ", и я могу проплыть " + distance + " метров");
        }
    }

    public static int getCount() {
        return count;
    }
}
