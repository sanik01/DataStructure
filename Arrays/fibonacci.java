import java.util.Scanner;

public class fibonacci {

       public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fonacci numbers to: ");
               int n = scanner.nextInt();
               long[] fibSequence = fibonacci(n);
               for (int i = 0; i < fibSequence.length; i++) {
                   System.out.print(fibSequence[i] + " ");
               }
           }
       
           public static long[] fibonacci(int n) {
               if (n <= 0) {
                   return new long[0];
               } else if (n == 1) {
                   return new long[]{0};
               } else if (n == 2) {
                   return new long[]{0, 1};
               } else {
                   long[] fibSequence = new long[n];
                   fibSequence[0] = 0;
                   fibSequence[1] = 1;
                   for (int i = 2; i < n; i++) {
                       fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
                   }
                   return fibSequence;
               }
           }
    }
      

