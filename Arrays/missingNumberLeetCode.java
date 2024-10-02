import java.util.Arrays;

class missingNumberLeetCode {
    
        public static void main(String[]args){
            int arr[]={1,2,3,5};
           
      
        Arrays.sort(arr);
       int n = arr.length;
       for(int i =0;i<n;i++){
            if(arr[i]!=i+1){// 0 1 2 3 4 
             System.out.println(i+1); //   1 2 3 5
            }
        }
        
    
        
    }
}