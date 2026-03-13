// Static keyword

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aashu", 28, 101);
        Student s2 = new Student("Sanya", 28, 102);

        //Student.college = "Birla";

        System.out.println(s1.name + " , " + s1.age + " , " + s1.rollNumber + " , " + Student.college);
        System.out.println(s2.name + " , " + s2.age + " , " + s2.rollNumber + " , " + Student.college);
    }
}
class Student {
    String name;
    int age;
    int rollNumber;
    static String college = "Birla";
    static int grade;

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Static block;
    static {
        grade = 8;
    }
}