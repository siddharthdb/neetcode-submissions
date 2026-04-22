class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if (nums.length == 1)
            return nums;
        
        var elemMap = new HashMap<Integer, Integer>();


        for(int i = 0; i < nums.length; i++) {
            var val = elemMap.get(nums[i]);
            if (val != null) {
                elemMap.put(nums[i], ++val);

            } else {
                elemMap.put(nums[i], 1);
            }
        }

        return elemMap.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
