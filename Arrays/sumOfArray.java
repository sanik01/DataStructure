public class sumOfArray {
    public static void main(String[]args){
        int array[]= {1,2,3,4,5,6,7,8,9,10};
        int n = 10;
        int sum=0;
        for(int idx =0;idx<n;idx++){
            sum = sum+ array[idx];
            
        }
        System.out.println("the sum of element is " + sum);

    }
}
