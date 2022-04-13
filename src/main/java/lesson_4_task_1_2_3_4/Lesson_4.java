package lesson_4_task_1_2_3_4;

public class Lesson_4 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Мухтар");
        animals[1] = new Dog("Рекс");
        animals[2] = new Cat("Буська");
        animals[3] = new Cat("Рыжий");

        animals[0].swim(9);
        animals[1].run(700);
        animals[2].run(199);
        animals[3].swim(10);

        System.out.println("/////////////////////////////////////////////");
        System.out.println("Всего создано животных: " + Animal.getCount());
        System.out.println("Всего создано кошек: " + Cat.getCount());
        System.out.println("Всего создано собак: " + Dog.getCount());
    }
}
