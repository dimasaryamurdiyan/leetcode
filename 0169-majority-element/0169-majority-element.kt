class Solution {
    fun majorityElement(nums: IntArray): Int {
        var majority = 0
        var res = 0
        val hash = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            hash.put(nums[i], 1 + hash.getOrDefault(nums[i], 0))
            println("${hash.get(nums[i])}")
            if (hash.get(nums[i]) ?: 0 > majority) {
                res = nums[i]
                majority = hash.get(nums[i])!!
            }
        }

        return res
    }
}