package lesson_7;

import java.io.*;

public class lesson_7 {
    public static void main(String[] args) throws IOException {
        AppData appData = new AppData(new String[]{"Столбец 1", "Столбец 2", "Столбец 3"},
                new int[][]{
                        {4, 5, 3},
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                });

        System.out.println("Запись в файл: \n" + appData);
        appData.save(appData);

        System.out.println("\n ///////////////////////////////// \n" + "Чтение файла: ");
        appData.readFile();
    }
}
