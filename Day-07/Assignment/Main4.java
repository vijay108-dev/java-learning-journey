package Assignment;
public class Main4 {
    public static void main(String[] args) {
        // java.util.Scanner sc = new java.util.Scanner(System.in);

        // int n = sc.nextInt();

        // if (n > 0)
        //     System.out.println("Positive number");

        // sc.close();




        //  java.util.Scanner sc = new java.util.Scanner(System.in);

        // int n = sc.nextInt();

        // if (n % 2 == 0)
        //     System.out.println("Even number");
        // else
        //     System.out.println("Odd number");

        // sc.close();





        // java.util.Scanner sc = new java.util.Scanner(System.in);

        // int age = sc.nextInt();

        // if (age >= 18)
        //     System.out.println("Eligible to vote");
        // else
        //     System.out.println("Not eligible");

        // sc.close();






        // java.util.Scanner sc = new java.util.Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a > b)
        //     System.out.println(a + " is greater");
        // else
        //     System.out.println(b + " is greater");

        // sc.close();






        // java.util.Scanner sc = new java.util.Scanner(System.in);

        // int temp = sc.nextInt();

        // if (temp < 10)
        //     System.out.println("Very Cold");
        // else if (temp < 25)
        //     System.out.println("Moderate");
        // else
        //     System.out.println("Hot");

        // sc.close();







        // java.util.Scanner sc = new java.util.Scanner(System.in);

        // int marks = sc.nextInt();

        // if (marks >= 90)
        //     System.out.println("Grade A");
        // else if (marks >= 75)
        //     System.out.println("Grade B");
        // else if (marks >= 60)
        //     System.out.println("Grade C");
        // else if (marks >= 40)
        //     System.out.println("Grade D");
        // else
        //     System.out.println("Fail");

        // sc.close();






        // java.util.Scanner sc = new java.util.Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if (a >= b && a >= c)
        //     System.out.println("Largest number is " + a);
        // else if (b >= a && b >= c)
        //     System.out.println("Largest number is " + b);
        // else
        //     System.out.println("Largest number is " + c);

        // sc.close();





        // java.util.Scanner sc = new java.util.Scanner(System.in);

        // int n = sc.nextInt();

        // if (n > 0)
        //     System.out.println("Positive number");
        // else if (n < 0)
        //     System.out.println("Negative number");
        // else
        //     System.out.println("Zero");

        // sc.close();






        // java.util.Scanner sc = new java.util.Scanner(System.in);

        // int day = sc.nextInt();

        // switch(day) {
        //     case 1: System.out.println("Monday"); break;
        //     case 2: System.out.println("Tuesday"); break;
        //     case 3: System.out.println("Wednesday"); break;
        //     case 4: System.out.println("Thursday"); break;
        //     case 5: System.out.println("Friday"); break;
        //     case 6: System.out.println("Saturday"); break;
        //     case 7: System.out.println("Sunday"); break;
        //     default: System.out.println("Invalid day");
        // }

        // sc.close();





        // java.util.Scanner sc = new java.util.Scanner(System.in);

        // int a = sc.nextInt();
        // char op = sc.next().charAt(0);
        // int b = sc.nextInt();

        // switch(op) {
        //     case '+': System.out.println(a + b); break;
        //     case '-': System.out.println(a - b); break;
        //     case '*': System.out.println(a * b); break;
        //     case '/': System.out.println(a / b); break;
        //     default: System.out.println("Invalid operator");
        // }

        // sc.close();






        java.util.Scanner sc = new java.util.Scanner(System.in);

        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");

        sc.close();


        //you can run all this codes in your compiler it will work correctly

        

       



    }
}