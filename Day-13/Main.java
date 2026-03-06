//Default Constructor + Instance
class Car{
String color;
int speed;
    // Default Constructor
    Car() {
        color = "Yellow";
        speed = 100;
        System.out.println("Default Constructor Called");
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {

        // Instance (Object)
        Car c1 = new Car();   // Constructor automatically runs

        c1.display();
    }
}