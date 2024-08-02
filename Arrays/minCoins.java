public class minCoins {
    public int minCoinsFunction(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    	    if(V == 0){
	        return 0;
	    }
	    
	    int ans = Integer.MAX_VALUE;
	    for(int val: coins){
	        if(val <= V){
    	        int valAns = minCoinsFunction(coins, M, V-val);
    	        if(valAns != -1)
	                ans = Math.min(ans, valAns);
	        }
	    }
	    if( ans == Integer.MAX_VALUE){
	        return -1;
	    }
	    return ans + 1;
	} 

	} 

