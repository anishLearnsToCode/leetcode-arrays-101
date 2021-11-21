from typing import List


class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        result = [0] * len(nums)
        left, right, index = 0, len(nums) - 1, 0
        while index < len(nums):
            if nums[index] % 2 == 0:
                result[left] = nums[index]
                left += 1
            else:
                result[right] = nums[index]
                right -= 1
            index += 1
        return result
