import java.util.Arrays;

public class MajoritySorting {
    public static int findMajorityElementSorting(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int candidate = nums[n / 2];
        int count = 0;
        
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        }
        return -1; // No majority element
    }
}