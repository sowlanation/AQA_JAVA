package lesson_4_task_1_2_3_4;

public class Cat extends Animal {
    int maxRun = 200;
    int maxSwim = 0;
    private static int count;

    public Cat(String name) {
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
            System.out.println("Моя кличка: " + name + " , извини, я котик и не умею плавать =) ");
        }
    }

    public static int getCount() {
        return count;
    }
}
