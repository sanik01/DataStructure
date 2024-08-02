//User function Template for Java


 
class countDistinctSubarray { 
    static int countDistinctSubarray(int arr[], int n) { 
     int res =0;
     HashSet<Integer> set =  new HashSet<>();
     HashMap<Integer,Integer> map = new HashMap<>();
     
     for(int ele: arr){
         set.add(ele);
     }
     int num = set.size();
     
     for(int i =0,j=0;i<arr.length;i++){
         map.put(arr[i], map.getOrDefault(arr[i],0)+1);
         if(map.size()==num){
             res += arr.length-i;
         }
     
         while(map.size()>=num && j<=i){
             map.put(arr[j],map.get(arr[j])-1);
             if(map.get(arr[j])<=0){
                 map.remove(arr[j]);
             }
             j++;
             if(map.size()==num){
                 res += arr.length-i;
             }
         }
     }
     return res;
    }
}