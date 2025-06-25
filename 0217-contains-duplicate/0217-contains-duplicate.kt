class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hash = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            hash.put(nums[i], 1 + hash.getOrDefault(nums[i], 0))

            if (hash.get(nums[i]) ?: -1 > 1) {
                return true
            } 
        }

        return false
    }
}