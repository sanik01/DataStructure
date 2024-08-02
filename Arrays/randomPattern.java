public class randomPattern {
    public static void main(String args[]) {
        int[] pattern = {2, 4, 3, 7, 9, 5, 1};
        int maxLevel = 0;
        for(int stars: pattern){
            maxLevel = Math.max(maxLevel, stars);
        }
        
        for(int level = maxLevel; level > 0; level--){
            for(int stars: pattern){
                if(stars >= level){
                    System.out.print("#\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
