class Solution {
    fun reverseWords(s: String): String {
        val words = s.trim().split("\\s+".toRegex())
        val reversed = words.reversed()
        return reversed.joinToString(" ")
    }
}