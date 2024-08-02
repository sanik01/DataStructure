public class RedandGreenCount {
    public static void main(String[] args) {
        String str = "RGRRGGRGRGGRGRGRGRGRGRGRRGRRRRGGRGRGGGRGRGRG";//G
// ind - (k-1)
        int k = 5;
        int red = 0;
        int green = 0;
        int ans = 0;
        for(int i = 0; i< str.length(); i++){
            char currentChr = str.charAt(i);
            if(currentChr == 'R'){
                red++;
            }else{
                green++;
            }
            if(i>= k-1){
                ans = Math.max(ans, green);
                char firstChar = str.charAt(i-(k-1));
                if(firstChar == 'R'){
                    red--;
                }else{
                    green--;
                }
            }
        }
        System.out.println("red and green max count " + ans + " ");
    }
}
