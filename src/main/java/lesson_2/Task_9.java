package lesson_2;

public class Task_9 {
    public static void main(String[] args) {
        printResult(task9(15, 10));
    }

    public static int[] task9(int len, int initialValue) {
        int[] arrays = new int[len];
        for (int i = 0; i < len; i++) {
            arrays[i] = initialValue;
        }
        return arrays;
    }

    public static void printResult(int[] arraysResult) {
        for (int j : arraysResult) {
            System.out.print(j + " ");
        }
    }
}
