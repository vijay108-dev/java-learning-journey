public class Main1 {
    public static void main(String[] args) 
    {

//Vote
//         int age = 18;

//         if(age >= 18){
//         System.out.println("You can vote");
// }else{

//     System.out.println("You cannot vote");
// }



//if – else if – else Example (Marks Grade)
// int marks = 85;

// if(marks >= 90){
//     System.out.println("Grade A");
// }
// else if(marks >= 75){
//     System.out.println("Grade B");
// }
// else if(marks >= 50){
//     System.out.println("Grade C");
// }
// else{
//     System.out.println("Fail");
// }


////Number Positive, Negative, Zero
// int num = -5;

// if(num > 0){
//     System.out.println("Positive number");
// }
// else if(num < 0){
//     System.out.println("Negative number");
// }
// else{
//     System.out.println("Zero");
// }

//Even or Odd
// int n = 7;

// if(n % 2 == 0){
//     System.out.println("Even number");
// }
// else{
//     System.out.println("Odd number");
// }

//Greatest of Two Numbers
// int a = 10;
// int b = 20;

// if(a > b){
//     System.out.println("a is greater");
// }
// else{
//     System.out.println("b is greater");
// }



//Greatest of Three Numbers (if else if)

// int a = 10, b = 25, c = 15;

// if(a > b && a > c){
//     System.out.println("a is greatest");
// }
// else if(b > a && b > c){
//     System.out.println("b is greatest");
// }
// else{
//     System.out.println("c is greatest");
// }


//Login system example
// String username = "Aashu";
// String password = "09";

// if(username.equals("Aashu") && password.equals("09")){
//     System.out.println("Login Successful");
// }
// else{
//     System.out.println("Wrong username or password");
// }


//Check Age and Nationality (Nested if)
// int age = 20;
// String country = "India";

// if(age >= 18) {
//     if(country.equals("India")) {
//         System.out.println("You can vote in India");
//     }
// }
// else {
//     System.out.println("You are under 18");
// }


//Check Marks and Attendance (Nested if)
// int marks = 70;
// int attendance = 80; // in percentage

// if(marks >= 40) {
//     if(attendance >= 75) {
//         System.out.println("Student is Pass and Eligible");
//     }
//     else {
//         System.out.println("Pass but Not Eligible (Low Attendance)");
//     }
// }
// else {
//     System.out.println("Fail");
// }


//switch statement

int day = 3;

switch(day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    default:
        System.out.println("Invalid Day");
}

    }
}
