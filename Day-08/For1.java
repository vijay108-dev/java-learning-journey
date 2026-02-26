public class For1 {
    public static void main(String[] args) {

        //Even Numbers 1 to 50
        // for(int i = 2; i <= 50; i += 2){
        //     System.out.println(i);
        // }



        //Factorial
        // int num =5;
        // int fact= 1;

        // for (int i = 1;i<=num; i++) 
        //     {
        //     fact *=i;
        // }

        // System.out.println("Factorial = " + fact);



        //Reverse Counting
        //  for(int i = 100; i >= 1; i--){
        //     System.out.println(i);
        //}



        //Prime Check
        int num = 8;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && num > 1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}