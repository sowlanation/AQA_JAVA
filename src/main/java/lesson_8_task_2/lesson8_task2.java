package lesson_8_task_2;

public class lesson8_task2 {
    public static void main(String[] args) {
        Phonebook pb = new Phonebook();
        pb.add("Петров", "35789");
        pb.add("Козлов", "35785559");
        pb.add("Уткин", "4568234");
        pb.add("Садовская", "45");
        pb.add("Котович", "354564789");
        pb.add("Садовская", "345645789");
        pb.add("Садовская", "34564564156489");

        System.out.println(pb);
        System.out.println("Результат поиска номера по фамилии: " + (pb.getPhoneNumber("Садовская")));
    }
}
