class Solution {
    fun isPalindrome(s: String): Boolean {
        if (s.isEmpty()) return true

        val phrase = s.filter { it.isLetterOrDigit() }.lowercase()
        var left = 0
        var size = phrase.length-1

        for(left in phrase.indices) {
            println("${phrase[left]}, ${phrase[size-left]}")
            if (phrase[left] == phrase[size-left]) {
                continue
            } else {
                return false
            }
        }

    
        return true
    }
}