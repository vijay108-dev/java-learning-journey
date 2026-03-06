public class Module {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Vijay";
        s1.age = 22;
        s1.rollNumber = 31;
        s1.college = "Birla";

        s2.name = "Sanya";
        s2.age = 21;
        s2.rollNumber = 32;
        s2.college = "Birla";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance() {
        System.out.println("Attendance marked by " + name);
    }

    void print() {
        System.out.println(name + " , " + age + " , " + rollNumber + " , " + college);
    }
}

// Java is almost complete object oriented programming