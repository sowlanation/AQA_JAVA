import java.util.ArrayList;
import java.util.List;

public class AQA_JAVA {

    private static class Student {
        final private int age;
        final private String name;

        private Student(final int age, final String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        final List<Student> studentList = new ArrayList<>() {{
            add(new Student(36, "Sasha"));
            add(new Student(54, "Roma"));
            add(new Student(25, "Petya"));
            add(new Student(30, "Vova"));
            add(new Student(10, null));
        }};
//        int counter = 0;
//        for(Student student : studentList){
//            if(student.age > 30 || (student.name==null || student.name.length()<=4)){
//                counter++;
//            }
//        }
        long count = studentList
                .stream()
                //Student(Sasha) Student(Roma)  Student(Petya) Student(Vova) Student(null)
                .filter(student -> student.getAge() > 25)
                //Student(Sasha) Student(Roma) Student(Vova)
                .map(student -> student.getName())
                //Sasha Roma Vova
                .filter(name -> name == null || name.length() <= 4)
                //Roma Vova
                .count();
        System.out.println(count);
    }
}