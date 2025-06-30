class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val hash = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            hash.put(nums[i], 1 + hash.getOrDefault(nums[i], 0))
        }

        val topKKeys = hash.entries
            .sortedByDescending { it.value }
            .take(k)
            .map { it.key }

        return topKKeys.toIntArray()

    }
}