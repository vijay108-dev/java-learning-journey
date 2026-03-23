public class Main {
    public static void main(String[] args) {

        
    }
}

class Sample {}

class Sample2 {}

// 1. Why one public class per file.
//2 WHy name of that public class should be same as filename

// JVM --> Demo.java. --> Demo.main()

// 1. Why only one public class per file?

//  Because Java does not want confusion.

// If there are many public classes
// JVM will not know which one to run

// So rule:
// Only one public class in one file


// 1. One public class?

//  To avoid confusion
//  JVM needs only one main class

// 2. Same file name?

//  JVM finds class using file name
//  If not same → error

//  3. JVM flow
// javac Main.java → java Demo → main() runs
