package Stack;
import java.util.Stack;
public class nextGreaterElement {
    public static void main(String[] args) {
        int[] ary = {3, 1, 5, 7, 5, 6};
        int len = ary.length;
        int[] nse = new int[len];
        Stack<Integer> stk = new Stack<>();

        for(int idx = len - 1; idx >= 0; idx--){
            int currentValue = ary[idx];

            // stack pop larger or equal elements 
            // because they can't be the answer to any element 
            // since I am smaller than them
            while(!stk.isEmpty() && ary[stk.peek()] <= currentValue){
                stk.pop();
            }

            if(stk.isEmpty()){
                nse[idx] = -1; // No smaller element found
            } else {
                nse[idx] = ary[stk.peek()];
            }

            stk.push(idx);
        }

        for(int val: nse){
            System.out.print(val + ", ");
        }
    }
}



 

