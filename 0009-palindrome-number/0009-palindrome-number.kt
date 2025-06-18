class Solution {
    fun isPalindrome(x: Int): Boolean {
        var remainder: Int
        var reversedInteger = 0
        var buffer : Int

        buffer = x

        if(x < 0) {
            return false
        } else {
            while(buffer != 0){
                remainder = buffer % 10
                reversedInteger = reversedInteger * 10 + remainder
                buffer /= 10
            }
        }

        return x == reversedInteger
    }
}