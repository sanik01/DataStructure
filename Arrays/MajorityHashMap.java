
import java.util.HashMap;

public class MajorityHashMap {
    public static int findMajorityElementHashMap(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) > n / 2) {
                return num;
            }
        }
        return -1; // No majority element
    }
}
