public class Q {
    public static void main(String[] args) {
        // int rows = 4, cols = 4;
        // for(int i = 1; i <= rows; i++)
        //     {
        //     for (int j = 1; j <= cols; j++) 
        //         {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }




        // int stars =5;

        // for(int i = 1; i <= stars; i++){
        //     System.out.print("* ");
        // }
        // System.out.println();

        // for(int i = 1; i <= stars - 1; i++){
        //     System.out.println("        *");
        // }


        // int rows = 5;
        // for(int i = 1; i <= rows; i++){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }




        // int rows = 5;
        // for(int i = rows; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }



        // int rows = 4, cols = 4;

        // for(int i = 1; i <= rows; i++){
        //     for(int j = 1; j <= cols; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }




        // int rows = 5;
        // for(int i = 1; i <= rows; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }




        // int rows = 4;
        // int num = 1;

        // for(int i = 1; i <= rows; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }



        // int rows = 5;

        // for(int i = 1; i <= rows; i++){

        //     for(int space = 1; space <= rows - i; space++){
        //         System.out.print(" ");
        //     }

        //     for(int star = 1; star <= i; star++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }




        // int rows = 5;
        // for(int i = rows; i >= 1; i--){

        //     for (int space = 1; space <= rows - i; space++){
        //         System.out.print(" ");
        //     }

        //     for(int star = 1; star <= i; star++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }




        // int rows = 5;
        // for(int i = 1; i <= rows; i++){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }




        int rows = 5;
        for(int i = 1; i <= rows; i++){

            int num;
            // Decide starting number for each row
            if(i % 2 == 1){
                num = 1;
            } else {
                num = 0;
            }

            for(int j = 1; j <= i; j++){

                System.out.print(num + " ");

                // Toggle between 1 and 0
                if(num==1){
                    num = 0;
                }else{
                    num= 1;
                }
            }

            System.out.println();
        }




        // int rows = 5;
        // // Upper pyramid
        // for (int i = 1; i <= rows; i++){

        //     for(int space = 1; space <= rows - i; space++)
        //         System.out.print(" ");

        //     for (int star = 1; star <= i; star++)
        //         System.out.print("* ");

        //     System.out.println();
        // }

        // // Lower pyramid
        // for(int i = rows - 1; i >= 1; i--){

        //     for(int space = 1; space <= rows - i; space++)
        //         System.out.print(" ");

        //     for(int star = 1; star <= i; star++)
        //         System.out.print("* ");

        //     System.out.println();
        // }





        // int rows = 5;
        // int num = 1;

        // for(int i = 1; i <=rows; i++){
        //     for (int j = 1; j<= i;j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }




        // int rows = 5;

        // for (int i = 0; i < rows; i++){

        //     for (int space = 0; space < rows - i; space++)
        //         System.out.print(" ");

        //     int num = 1;
        //     for (int j = 0; j <= i; j++){
        //         System.out.print(num + " ");
        //         num = num * (i - j) / (j + 1);
        //     }

        //     System.out.println();
        // }

    }
}