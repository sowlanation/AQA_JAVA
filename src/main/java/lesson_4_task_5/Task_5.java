package lesson_4_task_5;

public class Task_5 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Буська", 60);
        cats[1] = new Cat("Рыжий", 15);
        cats[2] = new Cat("Барс", 1);
        cats[3] = new Cat("Муся", 100);
        cats[4] = new Cat("Маркиз", 10);

        Plate plate = new Plate(36);
        for (Cat cat : cats) {
            if (cat.getAppetite() >= plate.getFood()) {
                plate.addFood(60);
            }
            cat.eat(plate);
        }
        System.out.println("////////////////////////////////////");
        plate.info();
    }
}
