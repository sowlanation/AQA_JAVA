package lesson_2;

public class Task_2 {
    public static void main(String[] args) {
        task2(0);
    }

    public static void task2(int a) {
        if (a >= 0) {
            System.out.println("Полученное число " + a + " положительное");
        } else {
            System.out.println("Полученное число " + a + " отрицательное");
        }
    }
}
