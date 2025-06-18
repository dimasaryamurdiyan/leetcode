class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        //save the num into hashset
        val sets = hashSetOf<Int>();

        for(i in nums.indices){
            //iteration check number in hashet
            if(sets.contains(nums[i])) {
                return true
            }
            sets.add(nums[i])
        }
        return false
    }
}