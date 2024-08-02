package Stack;

import java.util.Stack;

public class previousmaller {
    public static void main(String args[]) {
        int[] ary = {3, 1, 5, 7, 5, 6};
        int len = ary.length;
        int[] pse = new int[len];
        Stack<Integer> stk = new Stack<>();
        for(int idx = 0; idx < len; idx++){
            int currentValue = ary[idx];
            // stack pop larger elements 
            // because they can't be answer to any element 
            // since I am smaller than them
            while(!stk.isEmpty() && stk.peek() >= currentValue){
                stk.pop();
            }
            if(stk.isEmpty()){
                pse[idx] = -1;//given in ques
            }else{
                pse[idx] = stk.peek();
            }
            stk.push(currentValue);
        }
        for(int val: pse){
            System.out.print(val+ ", ");
        }
    }
}
