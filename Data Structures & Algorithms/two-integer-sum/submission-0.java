class Solution {
    public int[] twoSum(int[] nums, int target) {
        var mapRes = new HashMap<Integer, Integer>();

        if (nums.length < 2) {
            return new int[] {};
        }

        for (int i = 0; i < nums.length; i++) {
            var complement = target - nums[i];

            if (mapRes.containsKey(complement)) {
                return new int[] {mapRes.get(complement), i};
            } else {
                mapRes.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}
