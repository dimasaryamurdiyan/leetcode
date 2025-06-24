class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var j = 1
        for (i in 1..nums.size-1) {
            if (nums[i] != nums[j-1]) {
                nums[j] = nums[i]
                j++
            }
        }

        return j
    }
}