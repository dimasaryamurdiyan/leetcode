class Solution {
    fun lengthOfLastWord(s: String): Int {
        val words = s.trim()
        var counter = 0

        for (i in words.length-1 downTo 0) {
            println("${words[i].equals(" ")}")
            if (words[i] == ' ') {
                return counter
            } else {
                counter++
            }
        }

        return counter
    }
}