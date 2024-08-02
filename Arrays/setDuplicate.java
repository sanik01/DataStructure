public class setDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,2};
        int n = 5;
        contansDupicate(arr,n);
    }
    public boolean contansDupicate(int arr, n){
        Set<Integer> entry = new HashSet<>();
        for(int i =0;idx<n;idx++){
            if(entry.contains(arr[i])){
                return true;
            }
            entry.add(arr[i]);
        }
        return false;
    }
    // HashMap<Integer, Integer> map = new HashMap<>();
    // ArrayList<Integer> ans = new ArrayList<>();

    // for (int i = 0; i < n; i++) {
    //     if (map.containsKey(arr[i])) {
    //         if (!ans.contains(arr[i])) {
    //             ans.add(arr[i]);
    //         }
    //     } else {
    //         map.put(arr[i], i);
    //     }
    // }
}
