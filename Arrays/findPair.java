public class findPair {
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        for(int row=0;row<size;row++){
            for(int col = row+1;col<size;col++){
                if(Math.abs(arr[row]-arr[col])==n){
                    return true;
                    
                }
            }
        }
        return false;
    }
}
