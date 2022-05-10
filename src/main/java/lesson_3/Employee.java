package lesson_3;

public class Employee {
    private String FIO;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee(String FIO, String position, String email, String number, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("My FIO: " + FIO + ", My position: " + position + ", My email: " + email
                + ", My number: " + number + ", My salary: " + salary + ", My age: " + age);
    }

    @Override
    public String toString() {
        return String.format("FIO: %s , position: %s , email: %s , number: %s , salary: %d , age: %d",
                FIO, position, email, number, salary, age);
    }
}
