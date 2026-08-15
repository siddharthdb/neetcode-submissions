class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0)
            return false;

        var uniq = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (uniq.contains(nums[i])) {
                return true;
            } else {
                uniq.add(nums[i]);
            }
        }

        return false;
    }
}