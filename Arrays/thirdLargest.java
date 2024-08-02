public class thirdLargest {
    public static void main(String[]args){
       int arr[]={2,3,4,7,6};
       int firstLar= arr[0];
       int n = 5;
       int secondLar= Integer.MIN_VALUE;
       int thirdLar= Integer.MIN_VALUE;
       for(int idx =1;idx<arr.length;idx++){
        if(arr[idx]>firstLar){
            thirdLar=secondLar;
            secondLar=firstLar;
            firstLar=arr[idx];

        }else if(arr[idx]>secondLar){
            thirdLar=secondLar;
            secondLar=arr[idx];

        }else if(arr[idx]>thirdLar){
            thirdLar=arr[idx];
        }
        if(thirdLar==Integer.MIN_VALUE){
            System.out.println("No largest element");
        }
       }
       System.out.println("ThirdLargest Element is :" + thirdLar);

    }
}
