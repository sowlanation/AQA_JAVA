import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Task 2");
        System.out.println("Orange\nBanana\nApple");
        System.out.println("/////////////////////////////");
    }

    public static void checkSumSign() {
        System.out.println("Task 3");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение а: ");
        int a = s.nextInt();
        System.out.println("Введите значение b: ");
        int b = s.nextInt();
        int c = a + b;
        System.out.print("Результат: ");
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println("/////////////////////////////");
    }

    public static void printColor() {
        System.out.println("\nTask 4");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение а: ");
        int value = s.nextInt();
        System.out.print("Результат: ");
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        System.out.println("/////////////////////////////");
    }

    public static void compareNumbers() {
        System.out.println("\nTask 5");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение а: ");
        int a = s.nextInt();
        System.out.println("Введите значение b: ");
        int b = s.nextInt();
        System.out.print("Результат: ");
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}