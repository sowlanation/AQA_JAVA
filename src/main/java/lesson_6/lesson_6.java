package lesson_6;

public class lesson_6 {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"5", "5", "3", "9"},
                {"1", "2", "3", "3"},
                {"1", "2", "5", "5"},
                {"1", "2", "0", "5"}
        };

        try {
            System.out.println("Сумма элементов массива равна: " + arraySum(array));
        } catch (MyArraySizeException e) {
            System.out.println("Неверный размер массива. Массива должен быть [4][4]");
        } catch (MyArrayDataException e) {
            System.out.println("Неверные значения введены в поле " + "[" + e.j + "," + e.i + "]");
        }
    }

    public static int arraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int arrayLength = 4;

        if (array.length != arrayLength) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arrayLength; i++) {
            if (array[i].length != arrayLength) {
                throw new MyArraySizeException();
            }
        }

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
