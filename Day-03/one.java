public class one {   // public class named One (class = program blueprint)

    public static void main(String[] args) {  
        // main method = program execution starts from here

        // Integers --> byte, short, int, long
        // Number systems: Binary(2), Octal(8), Hexadecimal(16)

        //byte b = 5;      // decimal number (base 10)
        //byte b = 0b101;  // binary number (base 2)
        //byte b = 07;     // octal number (base 8)

        byte b = 0xA;     // hexadecimal number (A = 10 in decimal)

        short s = 10;     // short integer (2 bytes)
        int i = 4000;     // int integer (4 bytes)

        long l = 3412__56_789;  
        // long integer (8 bytes), underscore for readability only

        // Real numbers (decimal values)
        float f = 10.5_4f;  
        // float number, f means float, _ ignored by compiler

        //double d = 23.0987;  // normal double value

        double d = 6.02____2e23;  
        // scientific notation: 6.022 × 10^23

        // Characters
        char c = 'a';  
        // char stores single character, internally stored as number

        // Boolean
        boolean bool = false;  
        // boolean stores true or false only

        // Print integer values
        System.out.println("Integer values --> " + b + " , " + s + " , " + i + " , " + l);

        // Print float and double values
        System.out.println("Floating values --> " + f + " , " + d);

        // Print character
        System.out.println("Character values --> " + c);

        // Print boolean
        System.out.println("Boolean values --> " + bool);
    }  
}
