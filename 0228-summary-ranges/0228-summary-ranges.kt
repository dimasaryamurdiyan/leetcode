class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val list = mutableListOf<String>()
        var j = 0
        var count = 0

        if (nums.size == 1) {
            return listOf("${nums[0]}")
        }

        for (i in 1..nums.size-1) {
            if (nums[i] - nums[i-1] != 1) {
                if (count > 0) {
                    list.add("${nums[j]}->${nums[i-1]}")
                } else {
                    list.add(nums[j].toString())
                }
                
                j = i
                count = 0
            } else {
                count++
            }

            println("$j $i, $count ${nums.size-1}")
            if (i == nums.size-1) {
                if (count > 0) {
                    list.add("${nums[j]}->${nums[i]}")
                } else {
                    list.add(nums[j].toString())
                }
            }
              
        }

        return list
    }
}