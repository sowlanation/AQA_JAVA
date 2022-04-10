package lesson_2;

public class Task_5 {
    public static void main(String[] args) {
        int[] arrays = {0, 0, 1, 1, 0, 1, 1, 0};
        for (int array : arrays) {
            System.out.print(array + " ");
        }
        System.out.println();

        int[] editArrays = new int[8];
        System.arraycopy(arrays, 0, editArrays, 0, 8);
        for (int i = 0; i < editArrays.length; i++) {
            if (editArrays[i] == 0) {
                editArrays[i] = 1;
            } else {
                editArrays[i] = 0;
            }
            System.out.print(editArrays[i] + " ");
        }
    }
}
