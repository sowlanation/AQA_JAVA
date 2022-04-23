package lesson_2;

public class Task_8 {
    public static void main(String[] args) {
        int[][] arrays = new int[5][5];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if (i == j || j == arrays.length - i - 1) {
                    arrays[i][j] = 1;
                } else {
                    arrays[i][j] = 0;
                }
                System.out.print(arrays[i][j]);
            }
            System.out.println();
        }
    }
}
