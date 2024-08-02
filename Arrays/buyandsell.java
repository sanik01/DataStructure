public class buyandsell {
    public static void main(String args[]) {
        int ans = -1;
        int[] ary = {45,24,35,31,40,38,11};
        int min = ary[0];
        for(int idx = 1; idx< ary.length; idx++){
            if(ary[idx] < min){
                min = ary[idx];
            }else{
                ans = Math.max(ans, ary[idx]-min);
            }
        }
        System.out.println(ans);
    }
}
