import java.util.Arrays;

public class elementGreaterRightSide {
    	public static void main(String[] args) {
		int ary[] = {6,8,0,1,3};
        int ans[] = new int[ary.length];
        Arrays.fill(ans, -1);
        for(int idx = 0; idx<ary.length; idx++){
            for(int largerIdx = idx+1; largerIdx< ary.length; largerIdx++ ){

                if(ary[largerIdx] > ary[idx]){
                    ans[idx] = ary[largerIdx];
                    break;
                }
            }
        }
        for(int val: ans)
            System.out.print(val+"\t");

	}
}
