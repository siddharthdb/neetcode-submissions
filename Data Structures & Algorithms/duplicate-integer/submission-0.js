class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {

        if (nums.length === 0) {
            return false;
        }

        const arrSet = new Set();
        for (let i = 0; i < nums.length; i++) {
            if (arrSet.has(nums[i])) {
                return true;
            } else {
                arrSet.add(nums[i]);
            }
        }

        return false;
    }
}
