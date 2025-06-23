class Solution {
    fun isPalindrome(s: String): Boolean {
        if (s.isEmpty()) return true

        val phrase = s.filter { it.isLetterOrDigit() }.lowercase()
        var left = 0
        var right = phrase.length-1

        while (left < right) {
            if (phrase[left] != phrase[right]) {
                return false
            }
            left++
            right--
        }

        return true
    }
}