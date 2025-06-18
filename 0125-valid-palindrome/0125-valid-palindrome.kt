class Solution {
    fun isPalindrome(s: String): Boolean {
        if (s.isEmpty()) return true

        val phrase = s.filter { it.isLetterOrDigit() }.toLowerCase()

        val reversedText = StringBuilder()

        for (i in phrase.length - 1 downTo 0) {
            val char = phrase[i]

            reversedText.append(char)
        }
        println(phrase)
        println(reversedText.toString())
        return phrase == reversedText.toString()
    }
}