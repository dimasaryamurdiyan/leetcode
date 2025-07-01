class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val stringS = s.split(" ")

        if (stringS.size != pattern.length) return false

        val hashCharToWord = hashMapOf<Char, String>()
        val hashWordToChar = hashMapOf<String, Char>()

        for (i in pattern.indices) {
            if (hashCharToWord.containsKey(pattern[i])) {
                if (hashCharToWord.get(pattern[i]) != stringS[i]) return false
            } else {
                if (hashWordToChar.containsKey(stringS[i])) return false
                hashCharToWord.put(pattern[i], stringS[i])
                hashWordToChar.put(stringS[i], pattern[i])
            }
        }

        return true
    }
}