package lesson_2;

public class Task_7 {
    public static void main(String[] args) {
        int[] arrays = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Полученный массив: ");
        for (int array : arrays) {
            System.out.print(array + " ");
        }
        System.out.println();

        int[] editArrays = new int[12];
        System.arraycopy(arrays, 0, editArrays, 0, 12);
        System.out.println("Итоговый массив: ");
        for (int i = 0; i < editArrays.length; i++) {
            if (editArrays[i] < 6) {
                editArrays[i] = editArrays[i] * 2;
            }
            System.out.print(editArrays[i] + " ");
        }
    }
}
