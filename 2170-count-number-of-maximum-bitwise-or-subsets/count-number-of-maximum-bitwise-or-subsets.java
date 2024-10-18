class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        // Calculate the maximum possible bitwise OR of the entire array
        for (int num : nums) {
            maxOr |= num;
        }

        int n = nums.length;
        int subsetLength = 1 << n; // Total number of subsets is 2^n
        int count = 0;

        // Iterate through all subsets
        for (int j = 0; j < subsetLength; j++) {
            int currentOr = 0;
            // Calculate the OR for the current subset
            for (int i = 0; i < n; i++) {
                if ((j & (1 << i)) != 0) {
                    currentOr |= nums[i];
                }
            }
            // Count the subset if its OR matches the maximum OR
            if (currentOr == maxOr) {
                count++;
            }
        }

        return count;
    }
}