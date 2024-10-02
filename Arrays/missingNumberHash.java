public static int findMissingNumber(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }
    int n = nums.length + 1;
    for (int i = 0; i < n; i++) {
        if (!set.contains(i)) {
            return i;
        }
    }
    return -1;
}
