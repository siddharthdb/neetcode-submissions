class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        if len(nums) == 0:
            return False
        
        uniq = set()
        for n in nums:
            if (n in uniq):
                return True
            else:
                uniq.add(n)
        
        return False
        