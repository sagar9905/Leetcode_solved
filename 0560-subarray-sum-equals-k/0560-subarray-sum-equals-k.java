class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int sum = 0;

        // Empty prefix
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // Check how many previous prefix sums = sum-k
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store frequency of current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}