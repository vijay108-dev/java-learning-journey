public class Q {
    public static void main(String[] args) {
        // int[] arr = {10, 20, 30, 40, 50};
        // int sum = 0;
        
        // for(int i = 0; i < arr.length; i++){
        //     sum +=arr[i];
        // }
        
        // System.out.println("Sum = " + sum);





        // int[] arr = {12, 45, 7, 89, 23};
        
        // int max = arr[0];
        
        // for(int i = 1; i < arr.length; i++) {
        //     if(arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        
        // System.out.println("Maximum = " + max);





        String str = "Vijay";
        
        int count = 0;
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || 
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U'){
                count++;
            }
        }
        
        System.out.println("Vowels = " + count);










    }
}