class Solution {
    fun lengthOfLastWord(s: String): Int {
        val words = s.trim()
        
        return words.substringAfterLast(" ").length
    }
}