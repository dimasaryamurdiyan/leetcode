class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val x = k % nums.size
        nums.reverse()
        nums.reverse(0, x)
        nums.reverse(x, nums.size)
        
        // println(nums)
    }
}