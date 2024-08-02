public class secondLargestInArray {

    public static void main(String[]args){
        int array[]= { 5,3,6,7,19,10};
        int n = array.length;
        print2largest(array,n);
       
    }
    public static void print2largest(int arr[],int n){
        int firstLargest =Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for(int idx=0;idx<n;idx++){
            if(arr[idx] > firstLargest){
                secondLargest= firstLargest;
                firstLargest= arr[idx];

            }else if(arr[idx]>secondLargest && firstLargest!=arr[idx]){
                secondLargest= arr[idx];
            }
        }if(secondLargest==Integer.MIN_VALUE){
           System.out.println("-1");
        }
       System.out.println("secondLargest element is " + secondLargest);

    }
}

