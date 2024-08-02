public class zigZag {
    void zigZagCode(int arr[], int n) {
        // even then current should be less 
        // odd then current should be greater
        for(int idx = 0; idx < n - 1; idx++){
            if(idx%2 == 0){
                if(arr[idx] > arr[idx+1]){
                    swap(arr, idx);
                }
            }else{
                if(arr[idx] < arr[idx+1]){
                    swap(arr, idx);
                }
            }
        }
    }
    
    void swap(int arr[], int idx){
        int temp = arr[idx];
        arr[idx] = arr[idx+1];
        arr[idx+1] = temp;
    }
}

