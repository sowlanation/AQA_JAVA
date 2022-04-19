package lesson_7;

import java.io.*;
import java.util.Arrays;

public class AppData {
    private final String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public int[][] getData() {
        return data;
    }

    public void save(AppData data) throws IOException {
        File file = new File("D:\\Andersen\\Теория\\Java\\AQA_JAVA\\src\\main\\java\\lesson_7\\file.csv");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        writer.write(String.valueOf(data));
        writer.close();
    }

    public void readFile() throws IOException {
        File file = new File("D:\\Andersen\\Теория\\Java\\AQA_JAVA\\src\\main\\java\\lesson_7\\file.csv");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String readerResult = reader.readLine();
        while (readerResult != null) {
            System.out.println(readerResult);
            readerResult = reader.readLine();
        }
        reader.close();
    }

    @Override
    public String toString() {
        String[] array = new String[4];
        for (int i = 0; i < getData().length; i++) {
            array[i] = "\n" + Arrays.toString(getData()[i]);
        }
        return Arrays.toString(header) + "\n" + Arrays.deepToString(array);
    }
}
