class majorityElement {
    public int majorityElement(int[] nums) {
         int n = nums.length;
        
        // Iterate through each element to count its occurrences
        for (int i = 0; i < n; i++) {
            int count = 0;
            // Count occurrences of nums[i]
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            // Check if count exceeds n / 2
            if (count > n / 2) {
                return nums[i];
            }
        }
        
       
        return -1; 
    }
    
}
