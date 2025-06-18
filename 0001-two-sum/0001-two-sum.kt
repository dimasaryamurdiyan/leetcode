class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var output = IntArray(2)
        var seen = mutableMapOf<Int, Int>()

        for(i in nums.indices) {
            val diff2 = target - nums[i]
            if (seen.containsKey(diff2)) {
                output.set(0, seen.getValue(diff2))
                output.set(1, i)
                return output
            }
            
            seen[nums[i]] = i
        }

        return output
    }
}