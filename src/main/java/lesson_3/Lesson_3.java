package lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Садовская Александра Витальевна", "QA Engineer", "sadalex99@gmail.com",
                "123456789", 9999, 22);
        emp1.info();
        System.out.println("//////////////////////////////////////////////////////////////////////");

        Employee[] arraysEmploy = new Employee[5];
        arraysEmploy[0] = new Employee("Иванов Иван Иванович", "UI/UX", "gstrgsrtgh@gmail.com",
                "1111111", 3, 40);
        arraysEmploy[1] = new Employee("Петров Петр Петрович", "iOS-Developer", "4sfs2sfs5e@gmail.com",
                "3752695462", 5000, 41);
        arraysEmploy[2] = new Employee("Котов Алексей Владимирович", "Android-Developer", "cat@gmail.com",
                "798456123", 3549, 25);
        arraysEmploy[3] = new Employee("Цветкова Анна Александровна", "Sourcer", "flower@gmail.com",
                "375295642310", 100, 39);
        arraysEmploy[4] = new Employee("Плюшкин Андрей Игоревич", "PM", "plushko@gmail.com",
                "375294879620", 1000, 50);

        for (int i = 0; i < arraysEmploy.length; i++) {
            if (arraysEmploy[i].getAge() >= 40) {
                System.out.println("Сотрудник " + i + " данные: " + arraysEmploy[i]);
            }
        }
    }
}