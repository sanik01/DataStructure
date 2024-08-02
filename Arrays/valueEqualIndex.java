public class valueEqualIndex {
      
    public static void main(String[] args) {
        int arr[] = { 15,2,4,4,6};
        int n = arr.length;
        int newArr[] = new int[n];  
        
       for(int idx=0;idx<arr.length;idx++){
        if(idx+1==arr[idx]){
            newArr[idx]= arr[idx];
        }
        System.out.println("The number is : " + newArr[idx]);
       }
      
    }
}
