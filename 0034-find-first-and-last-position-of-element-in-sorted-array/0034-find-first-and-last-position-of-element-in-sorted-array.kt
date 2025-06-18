class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var start = 0
        var end = 0

        for ((i, num) in nums.withIndex()) {
            if (num == target) {
                start = i
                end = i 
                while (end+1 < nums.size && nums[end+1] == target) {
                    end++
                }
                return intArrayOf(start, end)
            }
        }


        return intArrayOf(-1, -1)
    }
}