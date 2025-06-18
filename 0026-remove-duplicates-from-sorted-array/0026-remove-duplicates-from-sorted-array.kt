class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val nonDuplicatedNumber = hashSetOf<Int>()

        for (i in nums.indices) {
            if (!nonDuplicatedNumber.contains(nums[i])) {
                nums[nonDuplicatedNumber.size] = nums[i]
                nonDuplicatedNumber.add(nums[i])
            } 
        }

        return nonDuplicatedNumber.size
    }
}