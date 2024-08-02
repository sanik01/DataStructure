public class kadane {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1};
        int n = 5;
        longSubArray(arr,n);
    }
    
    public static int longSubArray(int arr[], int n){
        int maxSum= Integer.MIN_VALUE;
        int curSum =0;
        for(int idx =0;idx<n;idx++){
            curSum+=curSum+arr[idx];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }if(maxSum==Integer.MIN_VALUE){
            return -1;
        }else{
            return maxSum;
        }
        
    }
}
