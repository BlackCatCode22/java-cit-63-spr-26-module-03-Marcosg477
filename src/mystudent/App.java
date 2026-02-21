package mystudent;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Marcos", 24, "Business Management");
        Student s2 = new Student("Alex", 22, "Computer Science");

        s1.printStudentInfo();
        System.out.println();
        s2.printStudentInfo();
    }
}