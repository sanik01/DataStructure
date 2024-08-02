public class arraypairmodkzero {
    public boolean canArrange(int[] arr, int k) {
        int len = arr.length;
        boolean[] ary = new boolean[len];
        for(int idx = 0; idx < len; idx++ ){
            if(ary[idx] == false){
                for(int other = idx+1; other < len; other++ ){
                    if(ary[other] == false){
                        if((arr[idx] + arr[other])%k == 0){
                            ary[idx] =true;
                            ary[other] =true;
                            break;
                        }
                    }
                }
            }
        }
        for(boolean val: ary){
            if(val == false){
                return false;
            }
            // System.out.print(val+" ");
        }

        return true;
    }  
}
