class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var j = 0

        for (i in 0..nums.lastIndex) {
            if (nums[i] != 0) {
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                j++
            }
        }
    }
}