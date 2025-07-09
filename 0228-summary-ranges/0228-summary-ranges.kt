class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.size == 1) {
            return listOf("${nums[0]}")
        }
        
        val result = mutableListOf<String>()
        var start = 0
        var count = 0

        for (i in 1 until nums.size) {
            if (nums[i] - nums[i - 1] != 1) {
                if (count > 0) {
                    result.add("${nums[start]}->${nums[i - 1]}")
                } else {
                    result.add(nums[start].toString())
                }
                start = i
                count = 0
            } else {
                count++
            }

            if (i == nums.size - 1) {
                if (count > 0) {
                    result.add("${nums[start]}->${nums[i]}")
                } else {
                    result.add(nums[start].toString())
                }
            }
        }

        return result
    }
}