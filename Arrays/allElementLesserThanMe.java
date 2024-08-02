public class allElementLesserThanMe {
    public static void main(String[] args) {
        int[] ques = {7,4,8,2,9};
        // Q- allElementsLesserThanMeBeforeMe
        // N^2
        int[] ans = new int[ques.length];
        for(int i = 0; i < ques.length; i++){
            int count = 0;
            for(int j = 0; j < i; j++){
                if(ques[j] < ques[i]){
                    count++;
                }
            }
            ans[i] = count;
        }
        for(int val: ans){
            System.out.println(val);
        }
    }
    
}
