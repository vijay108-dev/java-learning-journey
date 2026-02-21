// public class Main {
//     public static void main(String[] args) {
//         int a = 10;
//         double b = a;   // automatic conversion

//         System.out.println(b); //10
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         double x = 10.5;
//         int y = (int) x;   // manual conversion

//         System.out.println(y); //10
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         double a = 9.99;
//         int b = (int) a;   // truncating

//         System.out.println(b); //9
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         byte a = 10;
//         byte b = 20;
//         byte c = (byte)(a + b);  // promotion happens

//         System.out.println(c);
//     }
// }





public class Main {
    public static void main(String[] args) {
        //1. Implicit conversion 
        // (byte to int)
        // byte b = 24;
        // int i;

        // i = b;
        // System.out.println(i); // 24

        // character to int
        // char c = 'a';
        // int i;

        // i = c;

        // System.out.println(i); // 97

        // 2. Explicit conversion
        // int i = 300;
        // byte b; // -128 to +127

        // b = (byte) i;
        // System.out.println(b); // 300 % 256 = 44

        // 3. Truncating conversion
        // float f = 15.678f;
        // int i;

        // i = (int) f;
        // System.out.println(i); // 15

        // Boolean to any data type
        // These conversions are not possible

        // boolean bool = false;
        // int i;

        // i = bool;
        
        byte b = 50;
        b = (byte) (b * 2); // 100

        System.out.println(b);
    }
}