package recursion;

public class ArrayRecursion {
    public static void main(String args[]) {
        int[] ary = {1, 3, 5, 2, 7,9};
        System.out.println(sum(ary, ary.length - 2));//sum from index to last element
        // fum of all except last 3
        System.out.println(sum(ary,0) - sum(ary, ary.length - 3));
        //sum of all element except corners
        System.out.println(sum(ary, 1) - sum(ary, ary.length-1));

        
    }
    static int sum(int[] ary, int idx ){
        if(ary.length -1 == idx){
            return ary[idx];
        }
        return ary[idx] + sum(ary, idx+1);
    }
}
