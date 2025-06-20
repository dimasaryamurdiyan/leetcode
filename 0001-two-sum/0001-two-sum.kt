class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var output = IntArray(2)
        val hash = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            val checkDiff = target - nums[i]
            if (hash.containsKey(checkDiff)) {
                output = intArrayOf(hash.get(checkDiff) ?: -1, i)
                return output
            }
            hash.put(nums[i], i)
        }

        return output
    }
}