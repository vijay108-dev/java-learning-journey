//Parameterized Constructor + Multiple Instances
class Student {

    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Constructor Called for " + name);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class Main1 {
    public static void main(String[] args) {

        // Instances
        Student s1 = new Student("Vijay", 20);
        Student s2 = new Student("Mikasa", 22);

        s1.display();
        s2.display();
    }
}