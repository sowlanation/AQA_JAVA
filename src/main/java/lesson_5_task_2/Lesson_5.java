package lesson_5_task_2;

public class Lesson_5 {
    public static void main(String[] args) {
        Box<Orange> orange1 = new Box<Orange>();
        Box<Orange> orange2 = new Box<Orange>();
        Box<Apple> apple1 = new Box<Apple>();
        Box<Apple> apple2 = new Box<Apple>();

        orange1.addFruit(new Orange(), 10);
        orange2.addFruit(new Orange(), 12);
        apple1.addFruit(new Apple(), 8);
        apple2.addFruit(new Apple(), 8);

        System.out.println("В боксе 1 находится: " + orange1.weight() + " кг");
        System.out.println("В боксе 2 находится: " + orange2.weight() + " кг");
        System.out.println("В боксе 3 находится: " + apple1.weight() + " кг");
        System.out.println("В боксе 4 находится: " + apple2.weight() + " кг");

        System.out.println("Равен ли бокс 1 боксу 3?  Ответ: " + orange1.compare(apple1));
        System.out.println("Равен ли бокс 2 боксу 4?  Ответ: " + apple1.compare(apple2));

        System.out.println("\nТеперь пересыпим фрукты из одного ящика в другой \nОбновленный результат: ");
        orange1.pourTo(orange2);
        apple1.pourTo(apple2);

        System.out.println("В боксе 1 находится: " + orange1.weight() + " кг");
        System.out.println("В боксе 2 находится: " + orange2.weight() + " кг");
        System.out.println("В боксе 3 находится: " + apple1.weight() + " кг");
        System.out.println("В боксе 4 находится: " + apple2.weight() + " кг");
    }
}
