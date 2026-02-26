public class Continue1 {
    public static void main(String[] args) {


        //skip multiple of 3
        // for(int i = 1; i <= 20; i++){
        //     if (i%3==0)
        //         continue;
        //     System.out.println(i);
        // }




        //Print Only Odd Numbers
        // for (int i = 1; i <= 30; i++){
        //     if (i % 2 == 0)
        //         continue;
        //     System.out.println(i);
        // }





        //Skip Numbers Ending With 5
         for(int i = 1; i <= 50; i++){
            if(i%10==5)
                continue;
            System.out.println(i);
        }

    }
}