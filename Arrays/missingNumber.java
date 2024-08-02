public class missingNumber {
    
        int MissingNumber(int array[], int n) {
           // 1 2 3  5
         //  total 5 *(5+1)/2=15
            //  sum  of 1 2 3 5=11
           // number = total- sum=number
           int total = n * (n + 1) / 2;
            int sum = 0;
    
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
    
            return total - sum;
        }
    
}
