package lesson_5_task_1;

import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {
        Integer[] arrayInt = {1, 2, 3, 4, 5, 6, 7};
        String[] arrayString = {"A", "B", "C", "D", "E", "F"};
        swap(arrayInt, 3, 6);
        swap(arrayString, 1, 5);
    }

    public static void swap(Object[] array, int a, int b) {
        System.out.println("На вход получили массив: " + Arrays.toString(array));
        Object tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
        System.out.println("Результат перемещения 2х элементов: " + Arrays.toString(array) + "\n");
    }
}
